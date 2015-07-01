package ru.elomonosov.logic.domain;

import ru.elomonosov.data.TypeDataHandler;
import ru.elomonosov.entity.domain.Domain;
import ru.elomonosov.entity.type.Type;
import ru.elomonosov.logic.type.TypeHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dd on 28.06.2015.
 */
public class DefaultDomainHandler implements DomainHandler {

    @Override
    public Type createType(String name, TypeHandler typeHandler, TypeDataHandler typeDataHandler) throws DomainHandlerException {
        return null;
    }

    @Override
    public Type editType(Type oldType, String name, TypeHandler typeHandler, TypeDataHandler typeDataHandler) throws DomainHandlerException {
        return null;
    }

    @Override
    public void deleteType(Type type) throws DomainHandlerException {

    }

    @Override
    public List<Type> getAllTypes() throws DomainHandlerException {
        return null;
    }

    /*boolean uniqueCheck(String name) {
        List<Domain> domains = new ArrayList<>();


    }*/

}
