/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.feedbackDAO;
import java.util.ArrayList;
import java.util.List;
import model.feedback;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class feedbackDAOImp implements feedbackDAO{
    
    @Override
    
   public void saveFeedback(feedback feedback)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(feedback);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<feedback> showAllFeedback(){
       List<feedback> feedbackList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from feedback");
       feedbackList = query.list();
       return feedbackList;
   }
   
    @Override
    public void updateFeedback (int id,String name,String email,int contact,String subject,String message,int created_at){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       feedback feedback = (feedback)session.load(feedback.class,id);
       feedback.setName(name);
       feedback.setEmail(email);
       feedback.setContact(contact);
      feedback.setCreated_at(created_at);
       feedback.setSubject(subject);
       feedback.setMessage(message);
       
       session.update(feedback);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteFeedback(feedback feedback){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(feedback);
       transaction.commit();
       session.close();
  }
    
}
