package stijn_driessens.corsokoorts.services;

import stijn_driessens.corsokoorts.entities.BaseEntity;
import stijn_driessens.corsokoorts.repositories.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public abstract class CrudService<E extends BaseEntity, ID> implements ICrudService<E, ID> {
    private CrudRepository<E, ID> repos;

    public CrudService(CrudRepository repos) {
        this.repos = repos;
    }

    @Override
    public E insert(E e) {
        return repos.save(e);
    }

    @Override
    public E update(E e) {
        return repos.save(e);
    }

    @Override
    public Boolean delete(ID id) {
        this.repos.deleteById(id);
        return true;
    }

    @Override
    public E getById(ID id) {
        Optional<E> result = repos.findById(id);
        return result.isPresent() ? result.get() : null;
    }

    @Override
    public List<E> getAll() {
        return repos.findAll();
    }
}
