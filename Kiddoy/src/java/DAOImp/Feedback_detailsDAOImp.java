/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.Feedback_detailsDAO;
import java.util.ArrayList;
import java.util.List;
import model.Feedback_details;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class Feedback_detailsDAOImp implements Feedback_detailsDAO{
       @Override
   public void saveFeedback_details(Feedback_details feedback_details)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(feedback_details);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Feedback_details> showAllFeedback_details(){
       List<Feedback_details> Feedback_detailsList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Feedback_details");
       Feedback_detailsList = query.list();
       return Feedback_detailsList;
   }
   
    @Override
    public void updateFeedback_details(int feedback_id, int pro_id,int c_id){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Feedback_details feedback_details = (Feedback_details)session.load(Feedback_details.class,feedback_id);
       feedback_details.setPro_id(pro_id);
       feedback_details.setC_id(c_id);
       session.update(feedback_details);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteFeedback_details(Feedback_details feedback_details){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(feedback_details);
       transaction.commit();
       session.close();
  }
}
    

