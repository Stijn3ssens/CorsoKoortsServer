package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.Event;
import stijn_driessens.corsokoorts.services.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController extends CrudController<Event> {
    public EventController(CrudService<Event, Long> service) {
        super(service);
    }
}
