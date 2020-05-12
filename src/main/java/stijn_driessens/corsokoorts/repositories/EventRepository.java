package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.Event;
import org.springframework.stereotype.Component;

@Component
public interface EventRepository extends CrudRepository<Event, Long> {

}
