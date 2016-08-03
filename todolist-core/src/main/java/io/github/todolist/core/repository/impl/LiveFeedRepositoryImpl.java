package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.LiveFeedBean;
import io.github.todolist.core.repository.api.LiveFeedRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Paranjay on 8/2/2016.
 */
@Repository
public class LiveFeedRepositoryImpl implements LiveFeedRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public LiveFeedBean getLiveFeedBean(final long id) {
        return entityManager.find(LiveFeedBean.class, id);
    }

    public LiveFeedBean getLiveFeedBeanByIp(final String ip) {
        TypedQuery<LiveFeedBean> query = entityManager.createNamedQuery("getLiveFeedByIp", LiveFeedBean.class);
        query.setParameter("p_ip", ip);
        List<LiveFeedBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public LiveFeedBean getLiveFeedBeanByCountry(final String country) {
        TypedQuery<LiveFeedBean> query = entityManager.createNamedQuery("getLiveFeedByCountry", LiveFeedBean.class);
        query.setParameter("p_country", country);
        List<LiveFeedBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public LiveFeedBean getLiveFeedBeanByState(final String state) {
        TypedQuery<LiveFeedBean> query = entityManager.createNamedQuery("getLiveFeedByState", LiveFeedBean.class);
        query.setParameter("p_state", state);
        List<LiveFeedBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public LiveFeedBean getLiveFeedBeanByFileName(final String fileName) {
        TypedQuery<LiveFeedBean> query = entityManager.createNamedQuery("getLiveFeedByFileName", LiveFeedBean.class);
        query.setParameter("p_fileName", fileName);
        List<LiveFeedBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public LiveFeedBean getLiveFeedBeanByInfection(final String infection) {
        TypedQuery<LiveFeedBean> query = entityManager.createNamedQuery("getLiveFeedByInfection", LiveFeedBean.class);
        query.setParameter("p_infection", infection);
        List<LiveFeedBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public LiveFeedBean getLiveFeedBeanByPort(final int port) {
        TypedQuery<LiveFeedBean> query = entityManager.createNamedQuery("getLiveFeedByPort", LiveFeedBean.class);
        query.setParameter("p_port", port);
        List<LiveFeedBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

}
