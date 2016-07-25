package io.github.todolist.core.domain;

import java.util.Date;

/**
 * Created by Zhijie Yang on 7/25/16.
 */
public class StateBean {
    /*
    | id       | bigint(20)   | NO   | PRI | NULL    | auto_increment |
    | country  | varchar(128) | YES  |     | NULL    |                |
    | state    | varchar(128) | YES  |     | NULL    |                |
    | date     | date         | YES  |     | NULL    |                |
    | dayCount | bigint(20)   | NO   |     | NULL    |                |
     */
    private long id;
    private String country;
    private String state;
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

    public long getDayCount() {
        return dayCount;
    }

    public void setDayCount(long dayCount) {
        this.dayCount = dayCount;
    }

}