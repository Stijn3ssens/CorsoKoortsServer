package stijn_driessens.corsokoorts.security;

import stijn_driessens.corsokoorts.response.Response;
import stijn_driessens.corsokoorts.response.ResponseGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController extends BaseController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    private AccountRepository accountRepo;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public AccountController(AccountRepository accountRepo,
                             BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.accountRepo = accountRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public Response signUp(@RequestBody Account user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        Account created = accountRepo.save(user);

        return new ResponseGenerator<Account>().generateResponse(true, "Could not sign up...");
    }

    @PostMapping("/login")
    public ResponseEntity createAuthenticationToken(@RequestBody JwtRequest login) throws Exception {
        System.out.println(login.getUsername() + " - " + login.getPassword());
        authenticate(login.getUsername(), login.getPassword());
        final UserDetails userDetails = userDetailsService.loadUserByUsername(login.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);
        System.out.println(token);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    @GetMapping("/me")
    public Response me(HttpServletRequest request) {
        System.out.println("/me");

        String token = this.getAuthorizationToken(request);
        long userId = Long.parseLong(this.jwtTokenUtil.getClaimFromToken(token, "id").toString());
        Account result = accountRepo.findById(userId).get();

        if(result == null) {
            return new ResponseGenerator<Account>().generateResponse(false, "No user found.");
        } else {
            System.out.println("person = " + result.getName());
            return new ResponseGenerator<Account>().generateResponse(result, "No user found.");
        }
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
