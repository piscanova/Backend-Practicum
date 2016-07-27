package io.github.todolist.core.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by thanksgiving on 7/25/16.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "getDayCount", query = "SELECT g FROM FiletypeStat g WHERE g.typeName = :p_typeName AND g.singleDate = :p_singleDate"),
        @NamedQuery(name = "getTotalCount", query = "SELECT g FROM FiletypeStat g WHERE g.typeName = :p_typeName"),

})
public class FiletypeStat {
    @Id
    @GeneratedValue
    private int id;
    private String typeName;
    @Temporal(TemporalType.DATE)
    private Date singleDate;
    private long dayCount;
    private long totalCount;
    public FiletypeStat() {

    }
    public FiletypeStat(String typeName, Date singleDate, long dayCount, long totalCount) {
        this.typeName = typeName;
        this.singleDate = singleDate;
        this.dayCount = dayCount;
        this.totalCount = totalCount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getSingleDate() {
        return singleDate;
    }

    public void setSingleDate(Date singleDate) {
        this.singleDate = singleDate;
    }

    public long getDayCount() {
        return dayCount;
    }

    public void setDayCount(long dayCount) {
        this.dayCount = dayCount;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
