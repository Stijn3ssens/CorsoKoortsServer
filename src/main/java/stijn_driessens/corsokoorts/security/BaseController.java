package stijn_driessens.corsokoorts.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BaseController {
    @Autowired
    protected JwtTokenUtil jwtTokenUtil;

    protected String getAuthorizationToken(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        if(!header.startsWith("Bearer "))
            return "";

        // Add substring 7 because header starts with 'Bearer '
        return header.substring(7);
    }
}
