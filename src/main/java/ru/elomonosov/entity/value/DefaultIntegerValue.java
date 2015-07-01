package ru.elomonosov.entity.value;

/**
 * Created by dd on 26.06.2015.
 */
public class DefaultIntegerValue implements Value<Integer> {

    private Integer value;

    public DefaultIntegerValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean isEmpty() {
        //noinspection ObjectEqualsNull
        return (value.equals(0) || value.equals(null));
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
