package com.news.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private Set comments = new HashSet(0);


    // Constructors

    /** default constructor */
    public Users() {
    }

	/** minimal constructor */
    public Users(String username) {
        this.username = username;
    }
    
    /** full constructor */
    public Users(String username, String password, Set comments) {
        this.username = username;
        this.password = password;
        this.comments = comments;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }
   








}