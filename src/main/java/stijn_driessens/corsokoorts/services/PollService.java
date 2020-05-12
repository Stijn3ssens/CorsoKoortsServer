package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.Poll;
import stijn_driessens.corsokoorts.repositories.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService extends CrudService<Poll, Long> {
    public PollService(PollRepository repos) {
        super(repos);
    }
}
