package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.Tab;
import stijn_driessens.corsokoorts.services.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tab")
public class TabController extends CrudController<Tab> {
    public TabController(CrudService<Tab, Long> service) {
        super(service);
    }
}
