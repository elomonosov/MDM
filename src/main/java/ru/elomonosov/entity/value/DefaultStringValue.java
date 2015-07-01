package ru.elomonosov.entity.value;

/**
 * Created by dd on 26.06.2015.
 */
public class DefaultStringValue implements Value<String> {

    private String value;

    public DefaultStringValue(String value) {
        this.value = value;
    }

    @Override
    public boolean isEmpty() {
        return value.isEmpty();
    }

    @Override
    public String getValue() {
        return value;
    }
}
