package stijn_driessens.corsokoorts.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account applicationUser = repo.findByUsername(username);

        if(applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }

        return new CustomUserDetails(applicationUser.getId(), applicationUser.getUsername(), applicationUser.getPassword(), emptyList());
    }
}