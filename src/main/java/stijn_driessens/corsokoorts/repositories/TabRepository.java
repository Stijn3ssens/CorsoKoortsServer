package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.Tab;
import org.springframework.stereotype.Component;

@Component
public interface TabRepository extends CrudRepository<Tab, Long> {

}
