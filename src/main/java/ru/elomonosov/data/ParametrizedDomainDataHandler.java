package ru.elomonosov.data;

/**
 * Created by n dd on 29.05.2015.
 */
public class ParametrizedDomainDataHandler extends DefaultDomainDataHandler implements ParametrizedDataHandler {

    private int parameter;

    public ParametrizedDomainDataHandler(int parameter) {
        super();
        this.parameter = parameter;
    }

    @Override
    public int getParameter() {
        return parameter;
    }
}
