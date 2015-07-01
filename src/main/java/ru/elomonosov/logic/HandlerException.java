package ru.elomonosov.logic;

/**
 * Created by n dd on 24.05.2015.
 */
public class HandlerException extends Exception {

    public HandlerException(String info) {

        super(info);
    }

    public HandlerException() {

    }

    public HandlerException(String info, Exception cause) {

        super(info);
    }
}
