package ru.elomonosov.entity.attribute;

import ru.elomonosov.entity.type.Type;

/**
 * Created by dd on 26.06.2015.
 */
public interface Attribute<I> {

    I getId();

    String getName();

    String getDataType();

    int maxLength();

    Type getType();

    default Attribute getLinkedAttribute() {
        return null;
    }
}
