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
public class Feedback_details implements Serializable
{
    @Id @GeneratedValue
    int feedback_id;
    int pro_id;
    int c_id;

    public int getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(int feedback_id) {
        this.feedback_id = feedback_id;
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
