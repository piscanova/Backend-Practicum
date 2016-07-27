package io.github.todolist.core.repository.impl;
import io.github.todolist.core.domain.FiletypeStat;
import io.github.todolist.core.repository.api.FileTypeRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by Paranjay on 7/26/2016.
 */
@Repository
public class FileTypeRepositoryImpl implements FileTypeRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public FiletypeStat getFiletypeBean(final long id) {
        return entityManager.find(FiletypeStat.class, id);
    }
    public FiletypeStat getFiletypeBeanByNameAndDate(final String filetypeName, final Date date) {
        TypedQuery<FiletypeStat> query = entityManager.createNamedQuery("getDayCount", FiletypeStat.class);
        query.setParameter("p_typeName", filetypeName);
        query.setParameter("p_singleDate", date);
        List<FiletypeStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public FiletypeStat getFiletypeBeanByName(final String filetypeName) {
        TypedQuery<FiletypeStat> query = entityManager.createNamedQuery("getTotalCount", FiletypeStat.class);
        query.setParameter("p_typeName", filetypeName);
        List<FiletypeStat> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

}
