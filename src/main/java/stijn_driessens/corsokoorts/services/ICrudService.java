package stijn_driessens.corsokoorts.services;

import java.util.List;

public interface ICrudService<T, ID> {
    T insert(T t);
    T update(T t);
    Boolean delete(ID id);
    T getById(ID id);
    List<T> getAll();
}
