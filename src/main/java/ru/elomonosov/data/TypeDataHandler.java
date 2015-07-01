package ru.elomonosov.data;

import ru.elomonosov.entity.attribute.DefaultStringAttribute;
import ru.elomonosov.entity.record.DefaultRecord;
import ru.elomonosov.entity.type.Type;
import ru.elomonosov.entity.value.Value;
import ru.elomonosov.entity.version.DefaultVersion;

import java.util.List;

/**
 * Created by n dd on 27.05.2015.
 */
public interface TypeDataHandler extends DataHandler {

    default String getName() throws DataHandlerException {
        return getClass().getName();
    }

    List<DefaultStringAttribute> getAttributes() throws DataHandlerException;

    void saveRecord(DefaultRecord record) throws DataHandlerException;

    List<DefaultStringAttribute> getAttributes(Type type) throws DataHandlerException;

    List<DefaultStringAttribute> getAttributesLinkedTo(DefaultStringAttribute attribute) throws DataHandlerException;

    DefaultStringAttribute getLinkedAttribute(DefaultStringAttribute attribute) throws DataHandlerException;

    Value getValue(DefaultVersion version, DefaultStringAttribute attribute) throws DataHandlerException;

    void assignAttribute(DefaultStringAttribute attribute, Type type, DefaultStringAttribute linkedTo, boolean isNullable, boolean isUnique) throws DataHandlerException;

    void assignAttribute(DefaultStringAttribute attribute, DefaultStringAttribute linkedTo, boolean isNullable, boolean isUnique) throws DataHandlerException;

    DefaultRecord getRecord() throws DataHandlerException;

    List<DefaultRecord> getAllRecords() throws DataHandlerException;

    void deleteRecord(DefaultRecord record) throws DataHandlerException;

    List<DefaultRecord> getAllRecords(Type type) throws DataHandlerException;

    DefaultVersion getVersion(int versionId) throws DataHandlerException;

    List<DefaultVersion> getAllVersions(DefaultRecord record) throws DataHandlerException;

    void saveVersion(DefaultVersion version) throws DataHandlerException;

    void deleteVersion(DefaultVersion version) throws DataHandlerException;
}
