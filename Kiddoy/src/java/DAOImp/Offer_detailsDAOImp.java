/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.Offer_detailsDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Offer_details;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**    
 *
 * @author DELL
 */
public class Offer_detailsDAOImp implements Offer_detailsDAO{
         @Override
   public void saveOffer_details(Offer_details offer_details)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(offer_details);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Offer_details> showAllOffer_details(){
       List<Offer_details> Offer_detailsList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Offer_details");
       Offer_detailsList = query.list();
       return Offer_detailsList;
   }
   
    @Override
    public void updateOffer_details(int offer_id, String offer_name, String pro_id, Date offer_start_date, Date offer_end_date){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Offer_details offer_details = (Offer_details)session.load(Offer_details.class,offer_id);
       offer_details.setOffer_name(offer_name);
       offer_details.setPro_id(pro_id);
       offer_details.setOffer_start_date(offer_start_date);
       offer_details.setOffer_end_date(offer_end_date);
       session.update(offer_details);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteOffer_details(Offer_details offer_details){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(offer_details);
       transaction.commit();
       session.close();
  }
}

