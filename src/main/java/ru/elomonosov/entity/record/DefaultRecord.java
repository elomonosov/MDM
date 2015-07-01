package ru.elomonosov.entity.record;

import ru.elomonosov.entity.type.Type;

/**
 * Created by n dd on 24.05.2015.
 */
public class DefaultRecord<Integer> implements Record {

    private Integer id;

    private Type type;

    public DefaultRecord(Integer id, Type type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Type getType() {
        return null;
    }
}
