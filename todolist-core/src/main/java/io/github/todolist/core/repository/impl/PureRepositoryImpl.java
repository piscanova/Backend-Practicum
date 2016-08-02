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
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByIp", Pure.class);
        query.setParameter("p_ip", created_utc);
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

}