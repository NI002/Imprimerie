/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author itu
 */
public class Admin {
    int id;
    String Email;
    String password;
    
    public Admin(String Email, String password) {
        this.Email = Email;
        this.password = password;
    }

    public Admin(int id, String Email, String password) {
        this.id = id;
        this.Email = Email;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
