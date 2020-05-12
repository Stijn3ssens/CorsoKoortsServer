package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.Event;
import stijn_driessens.corsokoorts.repositories.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService extends CrudService<Event, Long> {
    public EventService(EventRepository repos) {
        super(repos);
    }
}
