package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.GeoStat;
import io.github.todolist.core.repository.api.GeoRepository;
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
public class GeoRepositoryImpl implements GeoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public GeoStat getGeoBean(final long id) {
        return entityManager.find(GeoStat.class, id);
    }

    public GeoStat getGeobeanByCountryDate(final String country, final Date date) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getCountryDayCount", GeoStat.class);
        query.setParameter("p_country", country);
        query.setParameter("p_date", date);
        List<GeoStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public GeoStat getGeobeanByStateDate(final String state, final Date date) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getStateDayCount", GeoStat.class);
        query.setParameter("p_state", state);
        query.setParameter("p_date", date);
        List<GeoStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public GeoStat getGeobeanByCountry(final String country) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getCountryTotalCount", GeoStat.class);
        query.setParameter("p_country", country);
        List<GeoStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public GeoStat getGeobeanByState(final String state) {
        TypedQuery<GeoStat> query = entityManager.createNamedQuery("getStateTotalCount", GeoStat.class);
        query.setParameter("p_state", state);
        List<GeoStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }
}
