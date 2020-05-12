package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.Buurtschap;
import stijn_driessens.corsokoorts.services.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/buurtschap")
public class BuurtschapController extends CrudController<Buurtschap> {
    public BuurtschapController(CrudService<Buurtschap, Long> service) {
        super(service);
    }
}
