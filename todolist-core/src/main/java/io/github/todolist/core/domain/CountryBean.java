package io.github.todolist.core.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Byte on 8/1/16.
 */
@Entity
@NamedQueries(
        @NamedQuery(name = "getCountryDayCount", query = "select c from CountryStat c where c.country = :c_country")

)
public class CountryBean implements Serializable {
    @Id
    @GeneratedValue

    /*
| id       | bigint(20)   | NO   | PRI | NULL    | auto_increment |
| country  | varchar(128) | YES  | MUL | NULL    |                |
| date     | date         | YES  |     | NULL    |                |
| dayCount | bigint(20)   | NO   | MUL | NULL    |                |
     */

    private long id;
    private String country;
    private Date date;
    private long dayCount;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDayCount() {
        return dayCount;
    }

    public void setDayCount(long dayCount) {
        this.dayCount = dayCount;
    }

}
