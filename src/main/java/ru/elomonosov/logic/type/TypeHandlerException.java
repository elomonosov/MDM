package ru.elomonosov.logic.type;

import ru.elomonosov.logic.HandlerException;

/**
 * Created by dd on 28.06.2015.
 */
public class TypeHandlerException extends HandlerException {
    public TypeHandlerException(String info) {

        super(info);
    }

    public TypeHandlerException() {

    }

    public TypeHandlerException(String info, Exception cause) {

        super(info);
    }
}
