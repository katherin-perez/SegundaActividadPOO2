package com.company;

public class ExistenceException extends Exception{

    private final int code;

    public ExistenceException(int code) {
        super();
        this.code = code;
    }

    public ExistenceException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
