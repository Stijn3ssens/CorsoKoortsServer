package stijn_driessens.corsokoorts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "members")
public class Member extends BaseEntity {
    @Column
    @NotNull
    private long accountId;

    @Column
    @NotNull
    private long organisationId;

    @Column
    @NotNull
    private int member;

    public long getAccountId() {
        return accountId;
    }

    public long getOrganisationId() {
        return organisationId;
    }

    public int getMember() {
        return member;
    }

    public Member() {
    }

    public Member(long id, long accountId, long organisationId, int member) {
        this.id = id;
        this.accountId = accountId;
        this.organisationId = organisationId;
        this.member = member;
    }
}
