package ru.elomonosov.entity.domain;

/**
 * Created by n dd on 24.05.2015.
 */
public class DefaultDomain implements Domain<Long> {

    private final Long id;

    private String name;

    public DefaultDomain(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }
}
