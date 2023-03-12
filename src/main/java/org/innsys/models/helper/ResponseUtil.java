package org.innsys.models.helper;


import java.util.ArrayList;
import java.util.List;

public class ResponseUtil<T> {

    private Boolean valid;
    private T body;
    private String message;
    private List<String> errorMessages;


    public ResponseUtil() {
        errorMessages = new ArrayList<>();
    }

    public ResponseUtil(Boolean valid, T body, String message, List<String> errorMessages) {
        this.valid = valid;
        this.body = body;
        this.message = message;
        this.errorMessages = errorMessages;
    }


    public ResponseUtil<T> setValidResponse(String message) {
        this.setValid(true);
        this.setMessage(message);
        return this;
    }

    public ResponseUtil<T> setValidResponse(String message, T body) {
        this.setValid(true);
        this.setMessage(message);
        this.setBody(body);
        return this;
    }

    public ResponseUtil<T> setInValidResponse(String error) {
        this.setValid(false);
        this.getErrorMessages().add(error);
        return this;
    }


    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public Boolean getValid() {
        return valid;
    }

    public T getBody() {
        return body;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }
}

