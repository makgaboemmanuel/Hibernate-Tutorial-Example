package com.firsthibernate;
// Generated 02 Sep 2020 9:48:15 AM by Hibernate Tools 5.3.0.Beta2


import java.util.Date;

/**
 * FailedJobs generated by hbm2java
 */
public class FailedJobs  implements java.io.Serializable {


     private Long id;
     private String connection;
     private String queue;
     private String payload;
     private String exception;
     private Date failedAt;

    public FailedJobs() {
    }

    public FailedJobs(String connection, String queue, String payload, String exception, Date failedAt) {
       this.connection = connection;
       this.queue = queue;
       this.payload = payload;
       this.exception = exception;
       this.failedAt = failedAt;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getConnection() {
        return this.connection;
    }
    
    public void setConnection(String connection) {
        this.connection = connection;
    }
    public String getQueue() {
        return this.queue;
    }
    
    public void setQueue(String queue) {
        this.queue = queue;
    }
    public String getPayload() {
        return this.payload;
    }
    
    public void setPayload(String payload) {
        this.payload = payload;
    }
    public String getException() {
        return this.exception;
    }
    
    public void setException(String exception) {
        this.exception = exception;
    }
    public Date getFailedAt() {
        return this.failedAt;
    }
    
    public void setFailedAt(Date failedAt) {
        this.failedAt = failedAt;
    }




}


