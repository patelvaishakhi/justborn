/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Kalpit Akhawat
 */
public class Admindetails implements Serializable
{
    
     @Id @GeneratedValue
    int id;
     String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
