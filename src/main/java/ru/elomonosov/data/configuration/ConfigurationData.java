package ru.elomonosov.data.configuration;

import ru.elomonosov.data.DataHandler;
import ru.elomonosov.entity.entity.Identified;
import ru.elomonosov.logic.Handler;

/**
 * Created by dd on 26.06.2015.
 */
public interface ConfigurationData {

    Handler getHandler(Identified entity);

    DataHandler getDataHandler(Identified entity);

    void setHandler(Identified entity, Handler handler);

    void setDataHandler(Identified entity, DataHandler dataHandler);
}
