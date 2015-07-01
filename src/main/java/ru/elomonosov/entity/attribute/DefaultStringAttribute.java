package ru.elomonosov.entity.attribute;


import ru.elomonosov.entity.type.Type;

/**
 * Created by n dd on 24.05.2015.
 */
public class DefaultStringAttribute implements Attribute<Integer> {

    private final Integer id;

    private final Type type;

    private final int maxLength;

    private final String name;

    public DefaultStringAttribute(Integer id, Type type, int maxLength, String name) {
        this.id = id;
        this.type = type;
        this.maxLength = maxLength;
        this.name = name;
    }

    @Override
    public String getDataType() {
        return "String";
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
    public int maxLength() {
        return maxLength;
    }

    @Override
    public Type getType() {
        return type;
    }
}
