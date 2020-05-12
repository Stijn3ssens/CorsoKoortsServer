package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.Tab;
import stijn_driessens.corsokoorts.repositories.TabRepository;
import org.springframework.stereotype.Service;

@Service
public class TabService extends CrudService<Tab, Long> {
    public TabService(TabRepository repos) {
        super(repos);
    }
}
