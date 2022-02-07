/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.InputStream;
import java.sql.Blob;

/**
 *
 * @author Renan
 */
public class Account {

    private Integer id;
    private String fullName;
    private String email;
    private String password;
    private Object avatar;   // Analisar o tipo futuramente 

  
    
    public Account(Integer Id, String fullName, String email, String password, Object Avatar) {
        this.id = Id;
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

 
}
