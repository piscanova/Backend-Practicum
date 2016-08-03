package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.Feed;
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

    public Feed getLiveFeedBean(final long id) {
        return entityManager.find(Feed.class, id);
    }

    public Feed getLiveFeedBeanByIp(final String ip) {
        TypedQuery<Feed> query = entityManager.createNamedQuery("getLiveFeedByIp", Feed.class);
        query.setParameter("p_ip", ip);
        List<Feed> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public Feed getLiveFeedBeanByCountry(final String country) {
        TypedQuery<Feed> query = entityManager.createNamedQuery("getLiveFeedByCountry", Feed.class);
        query.setParameter("p_country", country);
        List<Feed> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public Feed getLiveFeedBeanByState(final String state) {
        TypedQuery<Feed> query = entityManager.createNamedQuery("getLiveFeedByState", Feed.class);
        query.setParameter("p_state", state);
        List<Feed> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public Feed getLiveFeedBeanByFileName(final String fileName) {
        TypedQuery<Feed> query = entityManager.createNamedQuery("getLiveFeedByFileName", Feed.class);
        query.setParameter("p_fileName", fileName);
        List<Feed> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public Feed getLiveFeedBeanByInfection(final String infection) {
        TypedQuery<Feed> query = entityManager.createNamedQuery("getLiveFeedByInfection", Feed.class);
        query.setParameter("p_infection", infection);
        List<Feed> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

    public Feed getLiveFeedBeanByPort(final int port) {
        TypedQuery<Feed> query = entityManager.createNamedQuery("getLiveFeedByPort", Feed.class);
        query.setParameter("p_port", port);
        List<Feed> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;

    }

}
