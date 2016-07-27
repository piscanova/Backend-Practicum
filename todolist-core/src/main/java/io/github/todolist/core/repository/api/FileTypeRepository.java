package io.github.todolist.core.repository.api;
import io.github.todolist.core.domain.FiletypeStat;

import java.util.Date;

/**
 * Created by Paranjay on 7/26/2016.
 */
public interface FileTypeRepository {
    FiletypeStat getFiletypeBean(final long id);

    FiletypeStat getFiletypeBeanByNameAndDate(final String filetypeName, final Date date);

    FiletypeStat getFiletypeBeanByName(final String filetypeName);



}

