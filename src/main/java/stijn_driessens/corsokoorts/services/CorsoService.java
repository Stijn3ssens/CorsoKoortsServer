package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.Corso;
import stijn_driessens.corsokoorts.repositories.CorsoRepository;
import org.springframework.stereotype.Service;

@Service
public class CorsoService extends CrudService<Corso, Long> {
    public CorsoService(CorsoRepository repos) {
        super(repos);
    }
}
