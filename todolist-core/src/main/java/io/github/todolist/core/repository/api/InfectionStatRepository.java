package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.InfectionStat;

import java.util.Date;

/**
 * Created by thanksgiving on 8/1/16.
 */
public interface InfectionStatRepository {
    InfectionStat getInfectionStat(final long id);
    InfectionStat getInfectionStatByInfectionAndDate(final String infection, final Date date);
    InfectionStat getInfectionStatByInfection(final String infection);
}
