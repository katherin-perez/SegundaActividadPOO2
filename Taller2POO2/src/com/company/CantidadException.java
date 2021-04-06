package com.company;

public class CantidadException extends Exception{

    private final int code;

    public CantidadException(int code) {
        super();
        this.code = code;
    }

    public CantidadException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
