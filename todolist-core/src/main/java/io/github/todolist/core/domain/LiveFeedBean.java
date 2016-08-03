package io.github.todolist.core.domain;

import javax.persistence.*;

/**
 * Created by Paranjay on 8/2/2016.
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "getLiveFeedById", query = "SELECT p FROM Feed p WHERE p.id = :p_id"),
        @NamedQuery(name = "getLiveFeedByIp", query = "SELECT p FROM Feed p WHERE p.ip = :p_ip"),
        @NamedQuery(name = "getLiveFeedByCountry", query = "SELECT p FROM Feed p WHERE p.country = :p_country"),
        @NamedQuery(name = "getLiveFeedByState", query = "SELECT p FROM Feed p WHERE p.state = :p_state"),
        @NamedQuery(name = "getLiveFeedByFileName", query = "SELECT p FROM Feed p WHERE p.fileName = :p_fileName"),
        @NamedQuery(name = "getLiveFeedByInfection", query = "SELECT p FROM Feed p WHERE p.infection = :p_infection"),
        @NamedQuery(name = "getLiveFeedByPort", query = "SELECT p FROM Feed p WHERE p.port = :p_port"),
})

public class LiveFeedBean {
   /* +-----------+--------------+------+-----+---------+----------------+
            | Field     | Type         | Null | Key | Default | Extra          |
            +-----------+--------------+------+-----+---------+----------------+
            | id        | bigint(20)   | NO   | PRI | NULL    | auto_increment |
            | ip        | varchar(20)  | NO   |     | NULL    |                |
            | country   | varchar(128) | YES  |     | NULL    |                |
            | state     | varchar(128) | YES  |     | NULL    |                |
            | fileName  | varchar(256) | YES  |     | NULL    |                |
            | infection | varchar(256) | YES  |     | NULL    |                |
            | port      | bigint(20)   | YES  |     | NULL    |                |
            +-----------+--------------+------+-----+---------+----------------+*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getInfection() {
        return infection;
    }

    public void setInfection(String infection) {
        this.infection = infection;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Id
    @GeneratedValue
    private long id;
    private String ip;
    private String country;
    private String state;
    private String fileName;
    private String infection;
    private int port;


}
