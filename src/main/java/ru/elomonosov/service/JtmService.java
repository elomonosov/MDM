package ru.elomonosov.service;

import ru.elomonosov.data.DomainDataHandler;
import ru.elomonosov.data.TypeDataHandler;
import ru.elomonosov.entity.attribute.Attribute;
import ru.elomonosov.entity.domain.Domain;
import ru.elomonosov.entity.record.Record;
import ru.elomonosov.entity.type.Type;
import ru.elomonosov.entity.value.Value;
import ru.elomonosov.entity.version.Version;
import ru.elomonosov.logic.domain.DomainHandler;
import ru.elomonosov.logic.type.TypeHandler;

import java.util.Date;
import java.util.List;

/**
 * Created by n dd on 28.05.2015.
 */
public interface JtmService {

    // -- ConfigurationLogic

    void createDomain(Domain domain, DomainHandler domainHandler, DomainDataHandler dataHandler);

    void renameDomain(Domain domain, String newName);

    void deleteDomain(Domain domain);

    void editHandler(Domain domain, DomainHandler domainHandler);

    void editDataHandler(Domain domain, DomainDataHandler domainDataHandler);

    List<Domain> getAllDomains();

    // -- Domain

    void createType(Type type, TypeHandler typeHandler, TypeDataHandler dataHandler);

    void renameType(Type type, String newName);

    void deleteType(Type type);

    List<Type> getAllTypes(Domain Domain);

    // -- Type

    void createRecord(Type type, Record record);

    void editRecord(Record oldRecord, Record newRecord);

    void deleteRecord(Record record);

    List<Record> getAllRecords(Type type);

    List<Record> getRecords(Attribute attribute, Value value);

    Value getValue(Record record, Attribute attribute);

    void createVersion(Record record, Version version);

    void editVersion(Version oldVersion, Version newVersion);

    void deleteVersion(Version version);

    List<Version> getAllVersions(Record record);

    Version getVersion(Record record, Date actualDate);

    List<Version> getVersions(Type type, Date actualDate);

    List<Version> getVersions(Type type, Attribute attribute, Value value);

    Value getValue(Version version, Attribute attribute);
}
