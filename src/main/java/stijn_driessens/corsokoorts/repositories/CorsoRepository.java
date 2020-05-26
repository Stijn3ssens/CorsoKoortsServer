package stijn_driessens.corsokoorts.repositories;

import org.springframework.stereotype.Repository;
import stijn_driessens.corsokoorts.entities.Corso;
import org.springframework.stereotype.Component;

@Repository
public interface CorsoRepository extends CrudRepository<Corso, Long> {
}
