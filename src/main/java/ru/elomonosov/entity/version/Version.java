package ru.elomonosov.entity.version;

import ru.elomonosov.entity.record.Record;

/**
 * Created by dd on 26.06.2015.
 */
public interface Version<I, T> {

    I getId();

    T getStart();

    T getEnd();

    Record getRecord();
}
