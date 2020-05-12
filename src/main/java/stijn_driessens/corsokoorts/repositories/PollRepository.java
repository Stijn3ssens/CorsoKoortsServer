package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.Poll;
import org.springframework.stereotype.Component;

@Component
public interface PollRepository extends CrudRepository<Poll, Long> {

}
