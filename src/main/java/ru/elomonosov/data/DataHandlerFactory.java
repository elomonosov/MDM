package ru.elomonosov.data;


import ru.elomonosov.logic.domain.DomainHandler;

/**
 * Created by n dd on 29.05.2015.
 */
public class DataHandlerFactory {

    public static final DataHandlerFactory INSTANCE = new DataHandlerFactory();

    public static DataHandlerFactory getInstance() {
        return INSTANCE;
    }

    private DataHandlerFactory() {
    }

    public TypeDataHandler getTypeDataHandler() {
        return null;
    }

    public ParametrizedTypeDataHandler getTypeDataHandler(int parameter) {
        return null;
    }

    public DomainHandler getDomainDataHandler() {
        return null;
    }

    public ParametrizedDomainDataHandler getDomainDataHandlerint(int parameter) {
        return null;
    }
}
