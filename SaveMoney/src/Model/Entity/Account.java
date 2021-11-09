/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.awt.Image;

/**
 *
 * @author Renan
 */
public class Account {
    private int Id;
    private String FullName;
    private String Email;
    private Image Avatar;   // Analisar o tipo futuramente 

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Image getAvatar() {
        return Avatar;
    }

    public void setAvatar(Image Avatar) {
        this.Avatar = Avatar;
    }
}
