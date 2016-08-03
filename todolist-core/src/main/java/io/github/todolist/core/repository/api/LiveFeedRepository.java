package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.Feed;

/**
 * Created by Paranjay on 8/2/2016.
 */
public interface LiveFeedRepository {

    Feed getLiveFeedBean(final long id);

    Feed getLiveFeedBeanByIp(final String ip);

    Feed getLiveFeedBeanByCountry(final String country);

    Feed getLiveFeedBeanByState(final String state);

    Feed getLiveFeedBeanByFileName(final String fileName);

    Feed getLiveFeedBeanByInfection(final String infection);

    Feed getLiveFeedBeanByPort(final int port);

}
