package ru.elomonosov.logic.domain;

import ru.elomonosov.data.TypeDataHandler;
import ru.elomonosov.entity.type.Type;
import ru.elomonosov.logic.Handler;
import ru.elomonosov.logic.type.TypeHandler;

import java.util.List;

/**
 * Created by n dd on 24.05.2015.
 */
public interface DomainHandler extends Handler {

    Type createType(String name, TypeHandler typeHandler, TypeDataHandler typeDataHandler) throws DomainHandlerException;

    Type editType(Type oldType, String name, TypeHandler typeHandler, TypeDataHandler typeDataHandler) throws DomainHandlerException;

    void deleteType(Type type) throws DomainHandlerException;

    List<Type> getAllTypes() throws DomainHandlerException;
}
