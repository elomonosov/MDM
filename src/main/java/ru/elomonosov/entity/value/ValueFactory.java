package ru.elomonosov.entity.value;

/**
 * Created by dd on 26.06.2015.
 */
public class ValueFactory {

    private ValueFactory() {
    }

    public static Value getValue(int value) {

        return new DefaultIntegerValue(value);
    }

    public static Value getValue(String value) {
        return new DefaultStringValue(value);
    }

    public static Value getValue(Boolean value) {

        return new DefaultBooleanValue(value);
    }
}
