package stijn_driessens.corsokoorts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "getcorsos")
public class Corso extends BaseEntity {
    @Column(unique = true)
    @NotNull
    @Size(max = 50)
    private String name;

    @Column
    @NotNull
    private boolean corso = true;

    @Column
    @NotNull
    private long accountId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCorso(boolean corso) {
        this.corso = corso;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public boolean isCorso() {
        return corso;
    }

    public long getAccountId() {
        return accountId;
    }
}
