package stijn_driessens.corsokoorts.repositories;

import org.springframework.stereotype.Repository;
import stijn_driessens.corsokoorts.entities.Buurtschap;
import org.springframework.stereotype.Component;

@Repository
public interface BuurtschapRepository extends CrudRepository<Buurtschap, Long> {

}
