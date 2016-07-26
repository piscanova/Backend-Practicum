package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.GeoStat;
import io.github.todolist.core.repository.api.GeoStatRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by thanksgiving on 7/25/16.
 */
@Repository
public class GeoStatRepositoryImpl implements GeoStatRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public GeoStat getGeoBean(final long id) {
        return entityManager.find(GeoStat.class, id);
    }

    public GeoStat getGeobeanByCountryAndDate(final String country, final Date date) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getCountryDayCount", GeoStat.class);
        query.setParameter("p_country", country);
        query.setParameter("p_date", date);
        GeoStat res = query.getSingleResult();
        return (res != null) ? res : null;
    }

    public GeoStat getGeobeanByStateAndDate(final String state, final Date date) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getStateDayCount", GeoStat.class);
        query.setParameter("p_state", state);
        query.setParameter("p_date", date);
        GeoStat res = query.getSingleResult();
        return (res != null) ? res : null;
    }

    public GeoStat getGeobeanByCountry(final String country) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getCountryTotalCount", GeoStat.class);
        query.setParameter("p_country", country);
        GeoStat res = query.getSingleResult();
        return (res != null) ? res : null;
    }

    public GeoStat getGeobeanByState(final String state) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getStateTotalCount", GeoStat.class);
        query.setParameter("p_state", state);
        GeoStat res = query.getSingleResult();
        return (res != null) ? res : null;
    }

    public GeoStat getGeobeanByCountryCodeAndDate(final String countryCode, final Date date) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getCountryDayCountByCode", GeoStat.class);
        query.setParameter("p_countryCode", countryCode);
        query.setParameter("p_date", date);
        GeoStat res = query.getSingleResult();
        return (res != null) ? res : null;
    }

    public GeoStat getGeobeanByCountryCode(final String countryCode) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getCountryTotalCountByCode", GeoStat.class);
        query.setParameter("p_countryCode", countryCode);
        GeoStat res = query.getSingleResult();
        return (res != null) ? res : null;
    }
}
