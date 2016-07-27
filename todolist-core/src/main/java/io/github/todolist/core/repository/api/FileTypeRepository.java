package io.github.todolist.core.repository.api;
import io.github.todolist.core.domain.FiletypeBean;

import java.util.Date;

/**
 * Created by Paranjay on 7/26/2016.
 */
public interface FileTypeRepository {
    FiletypeBean getFiletypeBean(final long id);

    FiletypeBean getFiletypeBeanByNameAndDate(final String filetypeName, final Date date);

    FiletypeBean getFiletypeBeanByName(final String filetypeName);



}

