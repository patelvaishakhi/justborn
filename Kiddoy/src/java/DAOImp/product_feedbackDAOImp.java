/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.product_feedbackDAO;
import java.util.ArrayList;
import java.util.List;
import model.product_feedback;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class product_feedbackDAOImp implements product_feedbackDAO{
    @Override
    
   public void saveproduct_feedback(product_feedback product_feedback)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(product_feedback);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<product_feedback> showAllproduct_feedback(){
       List<product_feedback> product_feedbackList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from product_feedback");
       product_feedbackList = query.list();
       return product_feedbackList;
   }
   
    @Override
    public void updateproduct_feedback (int id,int uid,int review_count,String message,String created_date){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       product_feedback product_feedback = (product_feedback)session.load(product_feedback.class,id);
       product_feedback.setUid(uid);
       product_feedback.setReview_count(review_count);
       product_feedback.setMessage(message);
       product_feedback.setCreated_date(created_date);
       session.update(product_feedback);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteproduct_feedback(product_feedback product_feedback){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(product_feedback);
       transaction.commit();
       session.close();
  }
    
}
