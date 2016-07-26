package io.github.todolist.core.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

import static org.hsqldb.lib.tar.TarHeaderField.name;

@Entity
@NamedQueries({
        @NamedQuery(name = "getStateDayCount", query = "SELECT g FROM GeoStat g WHERE g.state = :p_state AND g.date = :p_date"),
        @NamedQuery(name = "getCountryDayCount", query = "SELECT g FROM GeoStat g WHERE g.country = :p_country AND g.date = :p_date"),
        @NamedQuery(name = "getStateTotalCount", query = "SELECT g FROM GeoStat g WHERE g.state = :p_state"),
        @NamedQuery(name = "getCountryTotalCount", query = "SELECT g FROM GeoStat g WHERE g.country = :p_country AND g.date = :p_date"),
        @NamedQuery(name = "getCountryTotalCountByCode", query = "SELECT g FROM GeoStat g WHERE g.countryCode = :p_countryCode"),
        @NamedQuery(name = "getCountryDayCountByCode", query = "SELECT g FROM GeoStat g WHERE g.countryCode = :p_countryCode AND g.date = :p_date")
})
public class GeoStat implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String country;
    private String state;
    private Date date;
    private long stateDayCount;
    private long coutryDayCount;
    private long stateTotalCount;
    private long countryTotalCount;
    private String countryCode;

    public GeoStat(String country, String state, Date date, long stateDayCount, long coutryDayCount, long stateTotalCount, long countryTotalCount, String countryCode) {
        this.country = country;
        this.state = state;
        this.date = date;
        this.stateDayCount = stateDayCount;
        this.coutryDayCount = coutryDayCount;
        this.stateTotalCount = stateTotalCount;
        this.countryTotalCount = countryTotalCount;
        this.countryCode = countryCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getStateDayCount() {
        return stateDayCount;
    }

    public void setStateDayCount(long stateDayCount) {
        this.stateDayCount = stateDayCount;
    }

    public long getCoutryDayCount() {
        return coutryDayCount;
    }

    public void setCoutryDayCount(long coutryDayCount) {
        this.coutryDayCount = coutryDayCount;
    }

    public long getStateTotalCount() {
        return stateTotalCount;
    }

    public void setStateTotalCount(long stateTotalCount) {
        this.stateTotalCount = stateTotalCount;
    }

    public long getCountryTotalCount() {
        return countryTotalCount;
    }

    public void setCountryTotalCount(long countryTotalCount) {
        this.countryTotalCount = countryTotalCount;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
