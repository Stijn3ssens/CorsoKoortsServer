package stijn_driessens.corsokoorts.security;

import stijn_driessens.corsokoorts.repositories.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
