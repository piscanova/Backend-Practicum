package io.github.todolist.core.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 +----------------+--------------+------+-----+---------+----------------+
 | Field          | Type         | Null | Key | Default | Extra          |
 +----------------+--------------+------+-----+---------+----------------+
 | id             | bigint(20)   | NO   | PRI | NULL    | auto_increment |
 | userAgent      | varchar(255) | YES  |     | NULL    |                |
 | date           | date         | YES  |     | NULL    |                |
 | useragentCount | int(11)      | YES  |     | NULL    |                |
 | total          | int(11)      | YES  |     | NULL    |                |
 +----------------+--------------+------+-----+---------+----------------+
 */
public class UseragentStat implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String userAgent;
    private Date date;
    private int useragentCount;
    private int total;
    public UseragentStat() {}

    public UseragentStat(String userAgent, Date date, int useragentCount, int total) {
        this.userAgent = userAgent;
        this.date = date;
        this.useragentCount = useragentCount;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUseragentCount() {
        return useragentCount;
    }

    public void setUseragentCount(int useragentCount) {
        this.useragentCount = useragentCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
