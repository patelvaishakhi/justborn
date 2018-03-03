/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.offerDAO;
import java.util.ArrayList;
import java.util.List;
import model.offer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author DELL
 */
public class offerDAOImp implements offerDAO{
    
           @Override
   public void saveOffer(offer offer)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(offer);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<offer> showOffer(){
       List<offer> offerList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Offer");
       offerList = query.list();
       return offerList;
   }
   
    @Override
    public void updateOffer ( int id,int pid,int cid,String type,String description,int startdate,int enddate){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       offer offer = (offer)session.load(offer.class,id);
       offer.setPid(pid);
       offer.setCid(cid);
       offer.setType(type);
       offer.setDecription(description);
       offer.setStartdate(startdate);
       offer.setEnddate(enddate);
       
       session.update(offer);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteOffer(offer offer){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(offer);
       transaction.commit();
       session.close();
  }
    
}
