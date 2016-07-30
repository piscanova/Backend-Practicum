package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.GeoStat;
import io.github.todolist.core.domain.Pure;

import java.util.Date;

/**
 * Created by Zhijie Yang on 7/26/16.
 */
public interface PureRepository {
    Pure getPureBean(final long id);

    /**
     * get Pure data by file name from table Pure.
     * @param fileName
     * @return
     */
    Pure getPureByFileName(final String fileName);

    /**
     * getIp from table Pure.
     * @param ip
     * @return
     */
    Pure getPureByIp(final String ip);

    /**
     * get protocol_id from table Pure.
     * @param protocol_id
     * @return
     */
    GeoStat getPureByProtocolId(final String protocol_id);

    /**
     * get Pure bean from table Pure by date.
     * @param created_utc
     * @return
     */
    GeoStat getPureByDate(final String created_utc);

    /**
     * get Pure By User Agent from table Pure.
     * @param user_agent
     * @return
     */
    GeoStat getPureByUserAgent(final String user_agent);

    /**
     * get Pure by infection type from table Pure.
     * @param infection
     * @return
     */
    GeoStat getPureByInfection(final String infection);

    /**
     * getIp from table Pure.
     * @param ip
     * @param fromDate
     * @param toDate
     * @return
     */
    Pure getIpWithinDateRange(final String ip, final Date fromDate, final Date toDate);

    /**
     * getIp from table Pure.
     * @param ip
     * @param date
     * @return
     */
    Pure getIpInDate(final String ip, final Date date);

}
