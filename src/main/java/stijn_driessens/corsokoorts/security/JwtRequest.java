package stijn_driessens.corsokoorts.security;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

public class JwtRequest implements Serializable {
//    @Value("${jwtVar.serialVersionUID}")
    private static long serialVersionUID = 5926468583005150707L;
    private String username;
    private String password;

    // need default constructor for JSON Parsing
    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}