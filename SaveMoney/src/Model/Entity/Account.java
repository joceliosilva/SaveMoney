/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.sql.Date;

/**
 *
 * @author Renan
 */
public class Account {

    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private Object avatar;
    private Date ceationDate;

    

    public Account(){}
    
    public Account(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    
    }
  
    
    public Account(Integer Id, String fullName, String email, String password, Object Avatar, Date creationDate) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
         this.avatar = Avatar;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getAvatar() {
        return avatar;
    }

    public void setAvatar(Object avatar) {
        this.avatar = avatar;
    }
    
    public Date getCeationDate() {
        return ceationDate;
    }

    public void setCeationDate(Date ceationDate) {
        this.ceationDate = ceationDate;
    }
}
