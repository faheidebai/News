package com.news.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Newsinfo entity. @author MyEclipse Persistence Tools
 */

public class Newsinfo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Topic topic;
     private String title;
     private String author;
     private Timestamp createdate;
     private String content;
     private String summary;
     private Set comments = new HashSet(0);


    // Constructors

    /** default constructor */
    public Newsinfo() {
    }

	/** minimal constructor */
    public Newsinfo(String title) {
        this.title = title;
    }
    
    /** full constructor */
    public Newsinfo(Topic topic, String title, String author, Timestamp createdate, String content, String summary, Set comments) {
        this.topic = topic;
        this.title = title;
        this.author = author;
        this.createdate = createdate;
        this.content = content;
        this.summary = summary;
        this.comments = comments;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Topic getTopic() {
        return this.topic;
    }
    
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }
    
    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }
   








}