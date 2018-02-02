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
public class Add_to_cart implements Serializable
{
    @Id @GeneratedValue
    int  Add_to_cart_id;
    int pro_id;
    int c_id;

    public int getAdd_to_cart_id() {
        return Add_to_cart_id;
    }

    public void setAdd_to_cart_id(int Add_to_cart_id) {
        this.Add_to_cart_id = Add_to_cart_id;
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
         
    
    
}
