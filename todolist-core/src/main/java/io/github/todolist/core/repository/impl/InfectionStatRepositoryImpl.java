package io.github.todolist.core.repository.impl;

import io.github.todolist.core.domain.FiletypeStat;
import io.github.todolist.core.domain.InfectionStat;
import io.github.todolist.core.repository.api.InfectionStatRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Repository
public class InfectionStatRepositoryImpl implements InfectionStatRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public InfectionStat getInfectionStat(final long id) {
        return entityManager.find(InfectionStat.class, id);
    }

    public InfectionStat getInfectionStatByInfectionAndDate(final String infection, final Date date) {
        TypedQuery<InfectionStat> query = entityManager.createNamedQuery("getInfectionDayCount", InfectionStat.class);
        query.setParameter("p_infection", infection);
        query.setParameter("p_date", date);
        List<InfectionStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public InfectionStat getInfectionStatByInfection(final String infection) {
        TypedQuery<InfectionStat> query = entityManager.createNamedQuery("getInfectionTotalCount", InfectionStat.class);
        query.setParameter("p_infection", infection);
        List<InfectionStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }
}
