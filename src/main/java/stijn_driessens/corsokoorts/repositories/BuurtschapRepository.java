package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.Buurtschap;
import org.springframework.stereotype.Component;

@Component
public interface BuurtschapRepository extends CrudRepository<Buurtschap, Long> {

}
