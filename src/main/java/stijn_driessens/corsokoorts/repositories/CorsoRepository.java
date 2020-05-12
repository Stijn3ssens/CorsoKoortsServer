package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.Corso;
import org.springframework.stereotype.Component;

@Component
public interface CorsoRepository extends CrudRepository<Corso, Long> {
}
