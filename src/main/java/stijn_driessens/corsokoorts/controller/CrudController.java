package stijn_driessens.corsokoorts.controller;

import stijn_driessens.corsokoorts.entities.BaseEntity;
import stijn_driessens.corsokoorts.response.Response;
import stijn_driessens.corsokoorts.response.ResponseGenerator;
import stijn_driessens.corsokoorts.security.BaseController;
import stijn_driessens.corsokoorts.services.CrudService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CrudController<E extends BaseEntity> extends BaseController implements ICrudController<E, Long> {
    private CrudService<E, Long> service;

    public CrudController(CrudService<E, Long> service) {
        this.service = service;
    }

    @Override
    @PostMapping("/")
    public Response<E> insert(HttpServletRequest request, @RequestBody E e) {
        E result = service.insert(e);
        return new ResponseGenerator<E>().generateResponse(result, "Could not insert...");
    }

    @Override
    @PutMapping("/{id}")
    public Response<E> update(HttpServletRequest request, @PathVariable Long id, @RequestBody E e) {
        E result = service.update(e);
        return new ResponseGenerator<E>().generateResponse(result, "Could not update...");
    }

    @Override
    @DeleteMapping("/{id}")
    public Response<E> delete(HttpServletRequest request, @RequestBody Long id) {
        Boolean result = service.delete(id);
        String message = result ? "Its deleted!" : "Could not delete...";
        return new ResponseGenerator<E>().generateResponse(result, message);
    }

    @Override
    @GetMapping("/{id}")
    public Response<E> getById(HttpServletRequest request, @PathVariable Long id) {
        E result = service.getById(id);
        return new ResponseGenerator<E>().generateResponse(result, "Could not find the ID...");
    }

    @Override
    @GetMapping("/")
    public Response<E> getAll(HttpServletRequest request) {
        System.out.println("GetAll");
        List<E> result = service.getAll();
        Response<E> response = new ResponseGenerator<E>().generateResponse(result, "Could not get all the objects");

        return response;
    }
}
