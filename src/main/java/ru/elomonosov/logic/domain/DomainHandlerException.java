package ru.elomonosov.logic.domain;

import ru.elomonosov.logic.HandlerException;

/**
 * Created by dd on 28.06.2015.
 */
public class DomainHandlerException extends HandlerException {
    public DomainHandlerException(String info) {

        super(info);
    }

    public DomainHandlerException() {

    }

    public DomainHandlerException(String info, Exception cause) {

        super(info);
    }
}
