/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.PaymentdetailsDAO;
import java.util.ArrayList;
import java.util.List;
import model.Paymentdetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author DELL
 */
public class PaymentdetailsDAOImp implements PaymentdetailsDAO{
    
     @Override
   public void savePaymentdetails(Paymentdetails paymentdetails)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(paymentdetails);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Paymentdetails> showAllPaymentdetails(){
       List<Paymentdetails> paymentdetailsList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Paymentdetails");
       paymentdetailsList = query.list();
       return paymentdetailsList;
   }
   
    @Override
    public void updatePaymentdetails(int id, String p_type,String c_id,String o_id,String p_status){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Paymentdetails paymentdetails = (Paymentdetails)session.load(Paymentdetails.class,id);
       paymentdetails.setP_type(p_type);
       paymentdetails.setC_id(c_id);
       paymentdetails.setO_id(o_id);
       paymentdetails.setP_status(p_status);
       session.update(paymentdetails);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deletePaymentdetails(Paymentdetails paymentdetails){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(paymentdetails);
       transaction.commit();
       session.close();
  }
}




