package ru.elomonosov.data;

import ru.elomonosov.entity.attribute.DefaultStringAttribute;
import ru.elomonosov.entity.record.DefaultRecord;
import ru.elomonosov.entity.type.Type;
import ru.elomonosov.entity.value.Value;
import ru.elomonosov.entity.version.DefaultVersion;

import java.util.List;

/**
 * Created by n dd on 28.05.2015.
 */
public class DefaulTypeDataHandler implements TypeDataHandler {


    public DefaulTypeDataHandler() {

    }

    @Override
    public List<DefaultStringAttribute> getAttributes() throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void saveRecord(DefaultRecord record) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<DefaultStringAttribute> getAttributes(Type type) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<DefaultStringAttribute> getAttributesLinkedTo(DefaultStringAttribute attribute) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public DefaultStringAttribute getLinkedAttribute(DefaultStringAttribute attribute) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Value getValue(DefaultVersion version, DefaultStringAttribute attribute) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void assignAttribute(DefaultStringAttribute attribute, Type type, DefaultStringAttribute linkedTo, boolean isNullable, boolean isUnique) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void assignAttribute(DefaultStringAttribute attribute, DefaultStringAttribute linkedTo, boolean isNullable, boolean isUnique) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public DefaultRecord getRecord() throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<DefaultRecord> getAllRecords() throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteRecord(DefaultRecord record) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<DefaultRecord> getAllRecords(Type type) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public DefaultVersion getVersion(int versionId) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<DefaultVersion> getAllVersions(DefaultRecord record) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void saveVersion(DefaultVersion version) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteVersion(DefaultVersion version) throws DataHandlerException {
        throw new UnsupportedOperationException();
    }
}
