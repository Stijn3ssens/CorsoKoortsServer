package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.Corso;
import stijn_driessens.corsokoorts.services.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/corso")
public class CorsoController extends CrudController<Corso> {
    public CorsoController(CrudService<Corso, Long> service) {
        super(service);
    }
}
