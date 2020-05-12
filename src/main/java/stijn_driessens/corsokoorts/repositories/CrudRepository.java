package stijn_driessens.corsokoorts.repositories;

import stijn_driessens.corsokoorts.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CrudRepository<E extends BaseEntity, ID> extends JpaRepository<E, ID> {
}
