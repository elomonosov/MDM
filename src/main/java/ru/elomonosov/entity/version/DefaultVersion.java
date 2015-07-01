package ru.elomonosov.entity.version;

import ru.elomonosov.entity.record.Record;

/**
 * Created by n dd on 24.05.2015.
 */
public class DefaultVersion<Integer, Date> implements Version {

    private Integer id;

    private Date startDate;

    private Date endDate;

    private Record record;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Date getStart() {
        return startDate;
    }

    @Override
    public Date getEnd() {
        return endDate;
    }

    @Override
    public Record getRecord() {
        return record;
    }
}
