/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date;
import java.util.List;
import model.offer;

/**
 *
 * @author DELL
 */
public interface offerDAO {
          public void saveOffer (offer offer);
    public List<offer> showOffer();
    public void updateOffer (int id,int pid,int cid,String type,String description,int startdate,int enddate);
    public void deleteOffer (offer offer);
    
}
