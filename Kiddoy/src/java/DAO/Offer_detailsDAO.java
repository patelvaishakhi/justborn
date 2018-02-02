/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date;
import java.util.List;
import model.Offer_details;

/**
 *
 * @author DELL
 */
public interface Offer_detailsDAO {
     public void saveOffer_details (Offer_details offer_details);
    public List<Offer_details> showAllOffer_details();
    public void updateOffer_details ( int offer_id, String offer_name, String pro_id, Date offer_start_date, Date offer_end_date);
    public void deleteOffer_details (Offer_details offer_details);
    
}
