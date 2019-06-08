package com.example.demo.exception;

public class RecordAlreadyExistsException extends Exception {
    private String redirect;

    public RecordAlreadyExistsException(String message) {
        super(message);
    }

    public RecordAlreadyExistsException(String message, String redirect) {
        super(message);
        this.redirect = redirect;
    }

    public String getRedirect() {
        return redirect;
    }
}
