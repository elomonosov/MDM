package ru.elomonosov.entity.attribute;

import ru.elomonosov.entity.type.Type;

/**
 * Created by dd on 26.06.2015.
 */
public class DefaultIntegerAttribute implements Attribute<Integer> {

    private final Integer id;

    private final Type type;

    private final int maxLength;

    private final String name;

    public DefaultIntegerAttribute(Integer id, Type type, int maxLength, String name) {
        this.id = id;
        this.type = type;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDataType() {
        return "Integer";
    }

    @Override
    public int maxLength() {
        return maxLength;
    }

    @Override
    public Type getType() {
        return type;
    }
}
