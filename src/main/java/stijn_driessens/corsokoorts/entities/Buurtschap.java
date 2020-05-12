package stijn_driessens.corsokoorts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "getbuurtschappen")
public class Buurtschap extends BaseEntity {
    @Column(unique = true)
    @NotNull
    @Size(max = 50)
    private String name;

    @Column
    @NotNull
    private boolean corso = false;

    @Column
    @NotNull
    private long accountId;

    public String getName() {
        return name;
    }

    public boolean isCorso() {
        return corso;
    }

    public long getAccountId() {
        return accountId;
    }
}
