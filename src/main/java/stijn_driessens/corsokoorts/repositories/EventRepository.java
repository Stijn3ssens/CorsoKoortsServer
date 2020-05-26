package stijn_driessens.corsokoorts.repositories;

import org.springframework.stereotype.Repository;
import stijn_driessens.corsokoorts.entities.Event;
import org.springframework.stereotype.Component;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
