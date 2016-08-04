package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.Pure;

import java.util.Date;
import java.util.List;

/**
 * Created by Zhijie Yang on 7/26/16.
 */
public interface PureRepository {
    /**
     * get Pure data by file name from table Pure.
     * @param fileName
     * @return
     */
    List<Pure> getPureByFileName(final String fileName, final int page);

    /**
     * getIp from table Pure.
     * @param ip
     * @return
     */
    List<Pure> getPureByIp(final String ip, final int page);

    /**
     * get Pure by infection type from table Pure.
     * @param infection
     * @return
     */
    List<Pure> getPureByInfection(final String infection, final int page);

    /**
     * get protocol_id from table Pure.
     * @param protocol_id
     * @return
     */
    Pure getPureByProtocolId(final String protocol_id);

    /**
     * get Pure bean from table Pure by date.
     * @param created_utc
     * @return
     */
    Pure getPureByDate(final String created_utc);

    /**
     * get Pure By User Agent from table Pure.
     * @param user_agent
     * @return
     */
    Pure getPureByUserAgent(final String user_agent);


    /**
     * getIp from table Pure.
     * @param ip
     * @param fromDate
     * @param toDate
     * @return
     */
    Pure getIpWithinDateRange(final String ip, final Date fromDate, final Date toDate);

    Pure getPureByInfectionAndDate(final String infection, final Date date1);

    Pure getPureByInfectionAndDateRange(final String infection, final Date date1, final Date date2);
}
