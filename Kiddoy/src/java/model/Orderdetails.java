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
 * @author Kalpit Akhawat
 */
public class Orderdetails implements Serializable
{
     @Id @GeneratedValue
    int id;
    int pro_id;
    int c_id;
    Date O_date;
    String delivery_charges;       

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public Date getO_date() {
        return O_date;
    }

    public void setO_date(Date O_date) {
        this.O_date = O_date;
    }

    public String getDelivery_charges() {
        return delivery_charges;
    }

    public void setDelivery_charges(String delivery_charges) {
        this.delivery_charges = delivery_charges;
    }
    
    
}
