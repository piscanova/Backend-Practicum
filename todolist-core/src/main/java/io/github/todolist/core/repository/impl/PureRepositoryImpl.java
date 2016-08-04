package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.Pure;
import io.github.todolist.core.repository.api.PureRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhijie Yang on 7/26/16.
 */
@Repository
public class PureRepositoryImpl implements PureRepository {
    @PersistenceContext
    private EntityManager entityManager;
    private int entriesPerPage = 20;

    public Pure getPure(final long id) {
        return entityManager.find(Pure.class, id);
    }

    public List<Pure> getPureByFileName(final String fileName, final int page) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByFileName", Pure.class);
        query.setParameter("p_name", fileName);
        List<Pure> resultList = query.getResultList().subList(entriesPerPage * page, entriesPerPage * (page + 1));
        return (resultList != null && !resultList.isEmpty()) ? resultList : null;
    }

    public List<Pure> getPureByInfection(final String infection, final int page) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByInfection", Pure.class);
        query.setParameter("p_infection", infection);
        List<Pure> resultList = query.getResultList().subList(entriesPerPage * page, entriesPerPage * (page + 1));
        return (resultList != null && !resultList.isEmpty()) ? resultList : null;
    }

    public List<Pure> getPureByIp(final String ip, final int page) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByIp", Pure.class);
        query.setParameter("p_ip", ip);
        List<Pure> resultList = query.getResultList().subList(entriesPerPage * page, entriesPerPage * (page + 1));
        return (resultList != null && !resultList.isEmpty()) ? resultList : null;
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

    public Pure getPureByProtocolId(final String protocol_id) {
        TypedQuery<Pure> query = entityManager.createNamedQuery("getPureByProtocolId", Pure.class);
        query.setParameter("protocol_id", protocol_id);
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

    public Pure getIpWithinDateRange(final String ip, final Date fromDate, final Date toDate) {
        return null;
    }
}
