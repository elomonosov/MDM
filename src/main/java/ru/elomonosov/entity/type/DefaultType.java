package ru.elomonosov.entity.type;

import ru.elomonosov.entity.domain.Domain;

/**
 * Created by n dd on 24.05.2015.
 */
public class DefaultType implements Type<Long> {

    private final Long id;

    private String name;

    private final Domain domain;


    public DefaultType(Domain domain, String name, Long id) {
        this.domain = domain;
        this.name = name;
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
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
    public Domain getDomain() {
        return domain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultType)) return false;

        DefaultType that = (DefaultType) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(domain != null ? !domain.equals(that.domain) : that.domain != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        return result;
    }
}
