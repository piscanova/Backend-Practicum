package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.GeoStat;

import java.util.Date;

/**
 * Created by thanksgiving on 7/25/16.
 */
public interface GeoRepository {
    GeoStat getGeoBean(final long id);

    /**
     * getGeobeanByCountryDate.
     * @param country
     * @param date
     * @return
     */
    GeoStat getGeobeanByCountryDate(final String country, final Date date);

    /**
     * getGeobeanByStateDate.
     * @param state
     * @param date
     * @return
     */
    GeoStat getGeobeanByStateDate(final String state, final Date date);

    /**
     * getGeobeanByCountry.
     * @param country
     * @return
     */
    GeoStat getGeobeanByCountry(final String country);

    /**
     * getGeobeanByState.
     * @param state
     * @return
     */
    GeoStat getGeobeanByState(final String state);
}
