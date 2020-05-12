package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.Poll;
import stijn_driessens.corsokoorts.services.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/poll")
public class PollController extends CrudController<Poll> {
    public PollController(CrudService<Poll, Long> service) {
        super(service);
    }
}
