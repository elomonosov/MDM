package ru.elomonosov.logic.type;

import ru.elomonosov.entity.attribute.Attribute;
import ru.elomonosov.entity.record.Record;
import ru.elomonosov.entity.version.Version;
import ru.elomonosov.logic.Handler;

import java.util.List;

/**
 * Created by n dd on 25.05.2015.
 */
public interface TypeHandler<E> extends Handler {

    Record createRecord() throws TypeHandlerException;

    Version createVersion(Record record) throws TypeHandlerException;

    void deleteRecord(Record record) throws TypeHandlerException;

    List<Attribute> getAllAttributes() throws TypeHandlerException;

    List<Attribute> getAttributesLinkedTo(Attribute attribute) throws TypeHandlerException;

    List<Record> getAllRecords() throws TypeHandlerException;

    List<Version> getAllVersions(Record record) throws TypeHandlerException;

    List<Version> getVersions(E actualPoint) throws TypeHandlerException;

    Version getVersion(Record record, E actualPoint) throws TypeHandlerException;
}
