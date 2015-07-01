package ru.elomonosov.data.configuration;

import ru.elomonosov.data.DataHandler;
import ru.elomonosov.entity.entity.Identified;
import ru.elomonosov.logic.Handler;

import java.util.Map;

/**
 * Created by dd on 26.06.2015.
 */
public class ConfigurationDataImpl implements ConfigurationData {

    protected Map<Identified, Handlers> config;

    public static ConfigurationDataImpl instance;

    private ConfigurationDataImpl() {

        this.config = ConfigurationOperatorXml.loadConfig(); //TODO загрузка
    }

    public static synchronized ConfigurationDataImpl getInstance() {
        if (instance == null) {
            instance = new ConfigurationDataImpl();
        }
        return instance;
    }

    public Handler getHandler(Identified entity) {

        return config.get(entity).handler;
    }

    public DataHandler getDataHandler(Identified entity) {

        return config.get(entity).dataHandler;
    }

    @Override
    public void setHandler(Identified entity, Handler handler) {

    }

    @Override
    public void setDataHandler(Identified entity, DataHandler dataHandler) {

    }

    protected class Handlers<E extends Handler, T extends DataHandler> {

        public final E handler;

        public final T dataHandler;

        public Handlers(E handler, T dataHandler) {
            this.handler = handler;
            this.dataHandler = dataHandler;
        }
    }
}
