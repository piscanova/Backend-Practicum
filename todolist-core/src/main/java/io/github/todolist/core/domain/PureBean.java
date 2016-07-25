package io.github.todolist.core.domain;

import java.util.Date;

/**
 * Created by Zhijie Yang on 7/25/16.
 */
public class PureBean {
    /*
| id              | bigint(20)   | NO   | PRI | NULL    |       |
| name            | varchar(260) | YES  |     | NULL    |       |
| ip              | varchar(20)  | YES  | MUL | NULL    |       |
| port            | int(11)      | YES  | MUL | NULL    |       |
| ip_num          | bigint(20)   | YES  | MUL | NULL    |       |
| size            | bigint(20)   | YES  |     | NULL    |       |
| sha1            | varchar(120) | YES  | MUL | NULL    |       |
| md5             | varchar(120) | YES  |     | NULL    |       |
| created_utc     | datetime     | YES  | MUL | NULL    |       |
| modified_utc    | datetime     | YES  |     | NULL    |       |
| user_agent      | varchar(100) | YES  | MUL | NULL    |       |
| base_user_agent | varchar(100) | YES  | MUL | NULL    |       |
| protocol_id     | bigint(20)   | YES  | MUL | NULL    |       |
| infection       | varchar(100) | YES  | MUL | NULL    |       |
     */
    private long id;
    private String name;
    private String ip;
    private int port;
    private long ip_num;
    private long size;
    private String sha1;
    private String md5;
    private Date created_utc;
    private Date modified_utc;
    private String user_agent;
    private String base_user_agent;
    private long protocol_id;
    private String infection;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getIp_num() {
        return ip_num;
    }

    public void setIp_num(long ip_num) {
        this.ip_num = ip_num;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getCreated_utc() {
        return created_utc;
    }

    public void setCreated_utc(Date created_utc) {
        this.created_utc = created_utc;
    }

    public Date getModified_utc() {
        return modified_utc;
    }

    public void setModified_utc(Date modified_utc) {
        this.modified_utc = modified_utc;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getBase_user_agent() {
        return base_user_agent;
    }

    public void setBase_user_agent(String base_user_agent) {
        this.base_user_agent = base_user_agent;
    }

    public long getProtocol_id() {
        return protocol_id;
    }

    public void setProtocol_id(long protocol_id) {
        this.protocol_id = protocol_id;
    }

    public String getInfection() {
        return infection;
    }

    public void setInfection(String infection) {
        this.infection = infection;
    }
}
