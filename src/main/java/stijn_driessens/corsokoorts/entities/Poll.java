package stijn_driessens.corsokoorts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "polls")
public class Poll extends BaseEntity {
    @Column
    @NotNull
    @Size(max = 50)
    private String name;

    @Column
    @NotNull
    private Long accountId;
}
