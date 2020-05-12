package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.BaseEntity;
import stijn_driessens.corsokoorts.response.Response;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;

@Repository
public interface ICrudController<E extends BaseEntity, ID> {
    Response<E> insert(HttpServletRequest request, E e);
    Response<E> update(HttpServletRequest request, ID id, E e);
    Response<E> delete(HttpServletRequest request, ID id);
    Response<E> getById(HttpServletRequest request, ID id);
    Response<E> getAll(HttpServletRequest request);
}
