package ru.elomonosov.data;


import ru.elomonosov.entity.type.Type;

import java.util.List;

/**
 * Created by n dd on 27.05.2015.
 */
public interface DomainDataHandler extends DataHandler {

    default String getName() throws DataHandlerException {
        return getClass().getName();
    }

    List<Type> getAllTypes() throws DataHandlerException;

    void deleteType(Type type) throws DataHandlerException;

    void createType(Type type) throws DataHandlerException;
}
