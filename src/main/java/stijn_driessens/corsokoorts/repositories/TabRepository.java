package stijn_driessens.corsokoorts.repositories;

import org.springframework.stereotype.Repository;
import stijn_driessens.corsokoorts.entities.Tab;
import org.springframework.stereotype.Component;

@Repository
public interface TabRepository extends CrudRepository<Tab, Long> {

}
