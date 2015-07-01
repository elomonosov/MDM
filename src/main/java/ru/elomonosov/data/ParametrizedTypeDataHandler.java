package ru.elomonosov.data;

/**
 * Created by n dd on 28.05.2015.
 */
public class ParametrizedTypeDataHandler extends DefaulTypeDataHandler implements ParametrizedDataHandler {

    private int parameter;

    public ParametrizedTypeDataHandler(int parameter) {
        super();
        this.parameter = parameter;
    }

    @Override
    public int getParameter() {
        return parameter;
    }
}
