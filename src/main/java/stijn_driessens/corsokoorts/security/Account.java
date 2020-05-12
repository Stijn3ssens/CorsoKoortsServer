package stijn_driessens.corsokoorts.security;

import stijn_driessens.corsokoorts.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {
    @Column
    @NotNull
    @Size(max = 50)
    private String name;

    @Column(unique = true)
    @NotNull
    @Size(max = 255)
    private String username;

    @Column(unique = true)
    @NotNull
    @Email
    @Size(max = 255)
    private String email;

    @Column(unique = true)
    @NotNull
    @Size(max = 255)
    private String password;





    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
