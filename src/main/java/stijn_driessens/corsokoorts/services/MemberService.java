package stijn_driessens.corsokoorts.services;

import org.springframework.stereotype.Service;
import stijn_driessens.corsokoorts.entities.Member;
import stijn_driessens.corsokoorts.repositories.MemberRepository;

@Service
public class MemberService extends CrudService<Member, Long> {
    private MemberRepository repos;

    public MemberService(MemberRepository repos) {
        super(repos);
        this.repos = repos;
    }

    public Member getMemberByUserAndSociety(long userId, long societyId)
    {
        return repos.getMemberByUserAndSociety(userId, societyId);
    }
}
