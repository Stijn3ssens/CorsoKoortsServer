package stijn_driessens.corsokoorts.repositories;

import org.springframework.stereotype.Repository;
import stijn_driessens.corsokoorts.entities.Poll;
import org.springframework.stereotype.Component;

@Repository
public interface PollRepository extends CrudRepository<Poll, Long> {

}
