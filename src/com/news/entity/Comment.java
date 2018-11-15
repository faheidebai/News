package com.news.entity;

import java.sql.Timestamp;


/**
 * Comment entity. @author MyEclipse Persistence Tools
 */

public class Comment  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Users users;
     private Newsinfo newsinfo;
     private String content;
     private Timestamp createTime;


    // Constructors

    /** default constructor */
    public Comment() {
    }

	/** minimal constructor */
    public Comment(Users users, Newsinfo newsinfo) {
        this.users = users;
        this.newsinfo = newsinfo;
    }
    
    /** full constructor */
    public Comment(Users users, Newsinfo newsinfo, String content, Timestamp createTime) {
        this.users = users;
        this.newsinfo = newsinfo;
        this.content = content;
        this.createTime = createTime;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    public Newsinfo getNewsinfo() {
        return this.newsinfo;
    }
    
    public void setNewsinfo(Newsinfo newsinfo) {
        this.newsinfo = newsinfo;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
   








}