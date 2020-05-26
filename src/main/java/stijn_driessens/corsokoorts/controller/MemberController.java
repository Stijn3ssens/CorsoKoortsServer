package stijn_driessens.corsokoorts.controller;

import org.springframework.web.bind.annotation.*;
import stijn_driessens.corsokoorts.entities.Article;
import stijn_driessens.corsokoorts.entities.Member;
import stijn_driessens.corsokoorts.response.Response;
import stijn_driessens.corsokoorts.response.ResponseGenerator;
import stijn_driessens.corsokoorts.services.MemberService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/member")
public class MemberController extends CrudController<Member> {
    private MemberService service;

    public MemberController(MemberService service) {
        super(service);
        this.service = service;
    }

    @GetMapping("/change/{societyId}/{memberStatus}")
    public Response changeMemberStatus(HttpServletRequest request, @PathVariable Long societyId, @PathVariable int memberStatus) {
        System.out.println("memberstatus: " + memberStatus);

        String token = this.getAuthorizationToken(request);
        long userId = Long.parseLong(this.jwtTokenUtil.getClaimFromToken(token, "id").toString());

        long id = service.getMemberByUserAndSociety(userId, societyId).getId();

        if (memberStatus < 1) { memberStatus = 1; }
        else if (memberStatus > 3) { memberStatus = 3; }

        Member result = service.update(new Member(id, userId, societyId, memberStatus));
        return new ResponseGenerator<Member>().generateResponse(result, "Could not do it...");
    }
}