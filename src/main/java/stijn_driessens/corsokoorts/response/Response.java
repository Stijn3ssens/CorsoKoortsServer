package stijn_driessens.corsokoorts.response;

import stijn_driessens.corsokoorts.entities.BaseEntity;

import java.util.List;

public class Response<E extends BaseEntity> {
    private String message;
    private List<E> result;
    private Boolean succeeded;

    public Response()
    {}

    public Response(List<E> result) {
        this.result = result;
        this.succeeded = true;
    }

    public Response(String message, Boolean succeeded) {
        this.message = message;
        this.succeeded = succeeded;
    }

    public Response(String errorMessage) {
        this.message = errorMessage;
        this.succeeded = false;
    }

    public String getMessage() {
        return message;
    }

    public List<E> getResult() {
        return result;
    }

    public Boolean getSucceeded() {
        return succeeded;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResult(List<E> result) {
        this.result = result;
    }

    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }
}
