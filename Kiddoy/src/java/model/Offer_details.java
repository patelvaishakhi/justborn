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
import javax.sound.midi.Sequencer;

/**
 *
 * @author Kalpit Akhawat
 */
public class Offer_details implements Serializable
{
 
    @Id @GeneratedValue
    int offer_id;
    String offer_name;
    String pro_id;
    Date offer_start_date;
    Date offer_end_date;

    public int getOffer_id() {
        return offer_id;
    }

    public void setOffer_id(int offer_id) {
        this.offer_id = offer_id;
    }

    public String getOffer_name() {
        return offer_name;
    }

    public void setOffer_name(String offer_name) {
        this.offer_name = offer_name;
    }

    public String getPro_id() {
        return pro_id;
    }

    public void setPro_id(String pro_id) {
        this.pro_id = pro_id;
    }

    public Date getOffer_start_date() {
        return offer_start_date;
    }

    public void setOffer_start_date(Date offer_start_date) {
        this.offer_start_date = offer_start_date;
    }

    public Date getOffer_end_date() {
        return offer_end_date;
    }

    public void setOffer_end_date(Date offer_end_date) {
        this.offer_end_date = offer_end_date;
    }
    
    
    
}
