package stijn_driessens.corsokoorts.response;

import stijn_driessens.corsokoorts.entities.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class ResponseGenerator<E extends BaseEntity> {
    public Response<E> generateResponse(E e, String errorMessage) {
        if (e == null)
        {
            return new Response<E>(errorMessage);
        }

        List<E> result = new ArrayList<>();
        result.add(e);
        return succeededResponse(result);
    }

    public Response<E> generateResponse(List<E> e, String errorMessage) {
        if (e == null)
        {
            return new Response<E>(errorMessage);
        }

        return succeededResponse(e);
    }

    private Response<E> succeededResponse(List<E> e)
    {
        return new Response<E>(e);
    }

    public Response<E> generateResponse(Boolean result, String message) {
        return new Response<E>(message, result);
    }
}
