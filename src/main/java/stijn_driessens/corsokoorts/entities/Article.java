package stijn_driessens.corsokoorts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "articles")
public class Article extends BaseEntity {
    @Column
    @NotNull
    @Size(max = 50)
    private String title;

    @Column
    @NotNull
    @Size(max = 20000)
    private String content;

    @Column
    @NotNull
    private Long organisationId;

    @Column
    @NotNull
    private Long tabId;

    @Column
    @NotNull
    private Date releasedate;

    @Column(name = "follow_releasedate")
    @NotNull
    private Date followReleasedate;

    @Column(name = "member_releasedate")
    @NotNull
    private Date memberReleasedate;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Long getOrganisationId() {
        return organisationId;
    }

    public Long getTabId() {
        return tabId;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public Date getFollowReleasedate() {
        return followReleasedate;
    }

    public Date getMemberReleasedate() {
        return memberReleasedate;
    }
}
