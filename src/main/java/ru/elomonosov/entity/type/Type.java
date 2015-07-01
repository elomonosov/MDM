package ru.elomonosov.entity.type;

import ru.elomonosov.entity.domain.Domain;
import ru.elomonosov.entity.entity.Identified;

/**
 * Created by dd on 26.06.2015.
 */
public interface Type<I> extends Identified<I> {

    String getName();

    void setName(String name);

    Domain getDomain();

}
