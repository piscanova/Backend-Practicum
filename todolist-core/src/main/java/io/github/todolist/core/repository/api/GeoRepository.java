package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.GeoBean;

import java.util.Date;

/**
 * Created by thanksgiving on 7/25/16.
 */
public interface GeoRepository {
    GeoBean getGeoBean(final long id);

    /**
     * getGeobeanByCountryDate.
     * @param country
     * @param date
     * @return
     */
    GeoBean getGeobeanByCountryDate(final String country, final Date date);

    /**
     * getGeobeanByStateDate.
     * @param state
     * @param date
     * @return
     */
    GeoBean getGeobeanByStateDate(final String state, final Date date);

    /**
     * getGeobeanByCountry.
     * @param country
     * @return
     */
    GeoBean getGeobeanByCountry(final String country);

    /**
     * getGeobeanByState.
     * @param state
     * @return
     */
    GeoBean getGeobeanByState(final String state);
}
