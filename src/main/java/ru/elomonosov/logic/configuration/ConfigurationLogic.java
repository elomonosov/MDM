package ru.elomonosov.logic.configuration;

import ru.elomonosov.data.DataHandler;
import ru.elomonosov.data.DomainDataHandler;
import ru.elomonosov.data.TypeDataHandler;
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
public interface ConfigurationLogic {

    Domain createDomain(String name, DomainHandler domainHandler, DomainDataHandler domainDataHandler);

    Domain editDomain(Domain oldDomain, String name, DomainHandler domainHandler, DomainDataHandler domainDataHandler);

    void deleteDomain(Domain domain);

    List<Domain> getAllDomains();

    TypeHandler getTypeHandler(Type type) throws ConfigurationException;

    TypeDataHandler getDataTypeHandler(Type type) throws ConfigurationException;

    void assignHandler(Identified entity, Handler handler);

    void assignDataHandler(Identified entity, DataHandler dataHandler);

    void editConfiguration(Identified entity, Handler handler, DataHandler dataHandler);
}
