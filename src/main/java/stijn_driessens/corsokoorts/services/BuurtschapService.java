package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.Buurtschap;
import stijn_driessens.corsokoorts.repositories.BuurtschapRepository;
import org.springframework.stereotype.Service;

@Service
public class BuurtschapService extends CrudService<Buurtschap, Long> {
    public BuurtschapService(BuurtschapRepository repos) {
        super(repos);
    }
}
