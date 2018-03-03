/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 * @author DELL
 */
public class order implements Serializable{
    @Id @GeneratedValue
    int id;
    int uid;
    String description;
    String shipping_address;
    Date date;
    int bill_ammount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getBill_ammount() {
        return bill_ammount;
    }

    public void setBill_ammount(int bill_ammount) {
        this.bill_ammount = bill_ammount;
    }

    
    
}


