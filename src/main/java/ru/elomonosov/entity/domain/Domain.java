package ru.elomonosov.entity.domain;

import ru.elomonosov.entity.entity.Identified;

/**
 * Created by dd on 26.06.2015.
 */
public interface Domain<I> extends Identified<I> {

    String getName();

    void setName(String name);
}
