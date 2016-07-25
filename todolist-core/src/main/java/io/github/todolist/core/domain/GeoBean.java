package io.github.todolist.core.domain;

import javax.persistence.*;
import java.util.Date;

import static org.hsqldb.lib.tar.TarHeaderField.name;

@Entity
@NamedQueries({
        @NamedQuery(name = "getStateDayCount", query = "SELECT g FROM GeoStat g WHERE g.state = :p_state AND g.date = :p_date"),
        @NamedQuery(name = "getCountryDayCount", query = "SELECT g FROM GeoStat g WHERE g.country = :p_country AND g.date = :p_date"),
        @NamedQuery(name = "getStateTotalCount", query = "SELECT g FROM GeoStat g WHERE g.state = :p_state"),
        @NamedQuery(name = "getCountryTotalCount", query = "SELECT g FROM GeoStat g WHERE g.country = :p_country AND g.date = :p_date")
})
public class GeoBean {
    @Id
    @GeneratedValue
    private long id;
    private String country;
    private String state;
    private Date date;
    private String stateDayCount;
    private String coutryDayCount;
    private String stateTotalCount;
    private String countryTotalCount;

    public GeoBean(String country, String state, Date date, String stateDayCount, String coutryDayCount, String stateTotalCount, String countryTotalCount) {
        this.country = country;
        this.state = state;
        this.date = date;
        this.stateDayCount = stateDayCount;
        this.coutryDayCount = coutryDayCount;
        this.stateTotalCount = stateTotalCount;
        this.countryTotalCount = countryTotalCount;
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

    public String getStateDayCount() {
        return stateDayCount;
    }

    public void setStateDayCount(String stateDayCount) {
        this.stateDayCount = stateDayCount;
    }

    public String getCoutryDayCount() {
        return coutryDayCount;
    }

    public void setCoutryDayCount(String coutryDayCount) {
        this.coutryDayCount = coutryDayCount;
    }

    public String getStateTotalCount() {
        return stateTotalCount;
    }

    public void setStateTotalCount(String stateTotalCount) {
        this.stateTotalCount = stateTotalCount;
    }

    public String getCountryTotalCount() {
        return countryTotalCount;
    }

    public void setCountryTotalCount(String countryTotalCount) {
        this.countryTotalCount = countryTotalCount;
    }
}
