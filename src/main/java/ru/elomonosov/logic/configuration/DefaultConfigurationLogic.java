package ru.elomonosov.logic.configuration;

import ru.elomonosov.data.DataHandler;
import ru.elomonosov.data.DomainDataHandler;
import ru.elomonosov.data.TypeDataHandler;
import ru.elomonosov.data.configuration.ConfigurationData;
import ru.elomonosov.data.configuration.ConfigurationDataImpl;
import ru.elomonosov.entity.domain.Domain;
import ru.elomonosov.entity.entity.Identified;
import ru.elomonosov.entity.type.Type;
import ru.elomonosov.logic.Handler;
import ru.elomonosov.logic.domain.DomainHandler;
import ru.elomonosov.logic.type.TypeHandler;

import java.util.List;

/**
 * Created by dd on 26.06.2015.
 */
public class DefaultConfigurationLogic implements ConfigurationLogic {

    private static ConfigurationData configuration;

    private static DefaultConfigurationLogic instance;

    private DefaultConfigurationLogic() {
    }

    public static synchronized DefaultConfigurationLogic getInstance() {
        if (instance == null) {
            instance = new DefaultConfigurationLogic();
        }
        configuration = ConfigurationDataImpl.getInstance(); //TODO Безопасно ли его каждый раз перезагружать при обращении к синглтону?
        return instance;
    }

    @Override
    public Domain createDomain(String name, DomainHandler domainHandler, DomainDataHandler domainDataHandler) {
        return null;
    }

    @Override
    public Domain editDomain(Domain oldDomain, String name, DomainHandler domainHandler, DomainDataHandler domainDataHandler) {
        return null;
    }

    @Override
    public void deleteDomain(Domain domain) {

    }

    @Override
    public List<Domain> getAllDomains() {
        return null;
    }

    @Override
    public TypeHandler getTypeHandler(Type type) throws ConfigurationException {

        TypeHandler result;
        try {
            Handler handler = configuration.getHandler(type);
            result = (TypeHandler) handler;
        } catch (NullPointerException e) {
            throw new ConfigurationException("Cannot find handler for " + type.toString() + " entity.");
        }
        return result;
    }

    @Override
    public TypeDataHandler getDataTypeHandler(Type type) throws ConfigurationException {
        TypeDataHandler result;
        try {
            DataHandler dataHandler = configuration.getDataHandler(type);
            result = (TypeDataHandler) dataHandler;
        } catch (NullPointerException e) {
            throw new ConfigurationException("Cannot find handler for " + type.toString() + " entity.");
        }
        return result;
    }

    @Override
    public void assignHandler(Identified entity, Handler handler) {

    }

    @Override
    public void assignDataHandler(Identified entity, DataHandler dataHandler) {

    }

    @Override
    public void editConfiguration(Identified entity, Handler handler, DataHandler dataHandler) {

    }
}
