package ru.elomonosov.entity.value;

/**
 * Created by n dd on 24.05.2015.
 */
public interface Value<V> {

    boolean isEmpty();

    V getValue();
}
