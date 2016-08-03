package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.LiveFeedBean;

/**
 * Created by Paranjay on 8/2/2016.
 */
public interface LiveFeedRepository {

    LiveFeedBean getLiveFeedBean(final long id);

    LiveFeedBean getLiveFeedBeanByIp(final String ip);

    LiveFeedBean getLiveFeedBeanByCountry(final String country);

    LiveFeedBean getLiveFeedBeanByState(final String state);

    LiveFeedBean getLiveFeedBeanByFileName(final String fileName);

    LiveFeedBean getLiveFeedBeanByInfection(final String infection);

    LiveFeedBean getLiveFeedBeanByPort(final int port);

}
