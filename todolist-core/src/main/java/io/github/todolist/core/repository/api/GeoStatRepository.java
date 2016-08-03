package io.github.todolist.core.repository.api;

import io.github.todolist.core.domain.GeoStat;

import java.util.Date;
import java.util.List;

/**
 * Created by thanksgiving on 7/25/16.
 */
public interface GeoStatRepository {
    GeoStat getGeoBean(final long id);

    /**
     * getGeobeanByCountryAndDate.
     * @param country
     * @param date
     * @return
     */
    GeoStat getGeobeanByCountryAndDate(final String country, final Date date);

    /**
     * getGeobeanByStateAndDate.
     * @param state
     * @param date
     * @return
     */
    GeoStat getGeobeanByStateAndDate(final String state, final Date date);

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

    /**
     * getGeobeanByCountryCode.
     * @param countryCode
     * @return
     */
    GeoStat getGeobeanByCountryCode(final String countryCode);

    /**
     * getGeobeanByCountryCodeAndDate.
     * @param countryCode
     * @param date
     * @return
     */
    GeoStat getGeobeanByCountryCodeAndDate(final String countryCode, final Date date);

    /**
     * getGeobeanByCountryCodeAndDate.
     * @return
     */
    List<Object[]> getGeobeanByAllCountryCount();


}
