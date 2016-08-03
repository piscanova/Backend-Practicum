package io.github.todolist.core.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 +----------------+--------------+------+-----+---------+----------------+
 | Field          | Type         | Null | Key | Default | Extra          |
 +----------------+--------------+------+-----+---------+----------------+
 | id             | bigint(20)   | NO   | PRI | NULL    | auto_increment |
 | infection      | varchar(255) | YES  | MUL | NULL    |                |
 | date           | date         | YES  |     | NULL    |                |
 | infectionCount | int(11)      | YES  |     | NULL    |                |
 | total          | int(11)      | YES  |     | NULL    |                |
 +----------------+--------------+------+-----+---------+----------------+
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "getInfectionDayCount", query = "SELECT i FROM InfectionStat i WHERE i.date = :p_date AND i.infection = :p_infection"),
        @NamedQuery(name = "getInfectionTotalCount", query = "SELECT i FROM InfectionStat i WHERE i.infection = :p_infection")
})
public class InfectionStat implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String infection;
    private Date date;
    private int infectionCount;
    private int total;

    public InfectionStat() {}
    public InfectionStat(String infection, Date date, int infectionCount, int total) {
        this.infection = infection;
        this.date = date;
        this.infectionCount = infectionCount;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInfection() {
        return infection;
    }

    public void setInfection(String infection) {
        this.infection = infection;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInfectionCount() {
        return infectionCount;
    }

    public void setInfectionCount(int infectionCount) {
        this.infectionCount = infectionCount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
