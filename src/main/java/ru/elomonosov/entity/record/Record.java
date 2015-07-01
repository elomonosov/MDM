package ru.elomonosov.entity.record;

import ru.elomonosov.entity.type.Type;

/**
 * Created by dd on 26.06.2015.
 */
public interface Record<I> {

    I getId();

    Type getType();
}
