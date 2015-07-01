package ru.elomonosov.entity.value;

/**
 * Created by dd on 26.06.2015.
 */
public class DefaultBooleanValue implements Value<Boolean> {

    private Boolean value;

    public DefaultBooleanValue(Boolean value) {
        this.value = value;
    }

    @Override
    public boolean isEmpty() {
        //noinspection ObjectEqualsNull
        return value.equals(null);
    }

    @Override
    public Boolean getValue() {
        return value;
    }
}
