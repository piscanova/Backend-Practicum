package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.Pure;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhijie Yang on 7/26/16.
 */
public class PureRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public Pure getPure(final long id) {
        return entityManager.find(Pure.class, id);
    }

    public Pure getPureByFileName(final String fileName) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByFileName", Pure.class);
        query.setParameter("p_name", fileName);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public Pure getPureByIp(final String filetypeName) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByIp", Pure.class);
        query.setParameter("p_ip", filetypeName);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public Pure getPureByDate (final String created_utc) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByDate", Pure.class);
        query.setParameter("p_created_utc", created_utc);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public Pure getPureByUserAgent(final String user_agent) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByUserAgent", Pure.class);
        query.setParameter("p_user_agent", user_agent);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public Pure getPureByInfection(final String infection) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByInfection", Pure.class);
        query.setParameter("p_infection", infection);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public Pure getPureByInfectionAndDate(final String infection, final Date date1) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByInfectionAndDate", Pure.class);
        query.setParameter("p_infection", infection);
        query.setParameter("p_created_utc", date1);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public Pure getPureByInfectionAndDateRange(final String infection, final Date date1, final Date date2) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByInfectionAndDateRange", Pure.class);
        query.setParameter("p_infection", infection);
        query.setParameter("p_created_utc", date1);
        query.setParameter("p_created_utc", date2);
        List<Pure> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }
}
