package io.github.todolist.core.repository.impl;
import io.github.todolist.core.domain.FiletypeBean;
import io.github.todolist.core.domain.GeoStat;
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

    public FiletypeBean getFiletypeBean(final long id) {
        return entityManager.find(FiletypeBean.class, id);
    }
    public FiletypeBean getFiletypeBeanByNameAndDate(final String filetypeName, final Date date) {
        TypedQuery<FiletypeBean> query = entityManager.createNamedQuery("getDayCount", FiletypeBean.class);
        query.setParameter("p_typeName", filetypeName);
        query.setParameter("p_singleDate", date);
        List<FiletypeBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

    public FiletypeBean getFiletypeBeanByName(final String filetypeName) {
        TypedQuery<FiletypeBean> query = entityManager.createNamedQuery("getTotalCount", FiletypeBean.class);
        query.setParameter("p_typeName", filetypeName);
        List<FiletypeBean> resultList = query.getResultList();
        return (resultList != null && !resultList.isEmpty()) ? resultList.get(0) : null;
    }

}
