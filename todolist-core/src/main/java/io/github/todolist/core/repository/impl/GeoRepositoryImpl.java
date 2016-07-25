package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.GeoBean;
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

    public GeoBean getGeoBean(final long id) {
        return entityManager.find(GeoBean.class, id);
    }

    public GeoBean getGeobeanByCountryDate(final String country, final Date date) {
        TypedQuery<GeoBean> query = entityManager.createNamedQuery("getCountryDayCount", GeoBean.class);
        query.setParameter("p_country", country);
        query.setParameter("p_date", date);
        List<GeoBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public GeoBean getGeobeanByStateDate(final String state, final Date date) {
        TypedQuery<GeoBean> query = entityManager.createNamedQuery("getStateDayCount", GeoBean.class);
        query.setParameter("p_state", state);
        query.setParameter("p_date", date);
        List<GeoBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public GeoBean getGeobeanByCountry(final String country) {
        TypedQuery<GeoBean> query = entityManager.createNamedQuery("getCountryTotalCount", GeoBean.class);
        query.setParameter("p_country", country);
        List<GeoBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public GeoBean getGeobeanByState(final String state) {
        TypedQuery<GeoBean> query = entityManager.createNamedQuery("getStateTotalCount", GeoBean.class);
        query.setParameter("p_state", state);
        List<GeoBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }
}
