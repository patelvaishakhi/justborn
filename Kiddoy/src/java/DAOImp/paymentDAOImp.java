/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.paymentDAO;
import DAO.paymentDAO;
import java.util.ArrayList;
import java.util.List;
import model.payment;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class paymentDAOImp implements paymentDAO{
    @Override
   public void savepayment(payment payment)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(payment);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<payment> showAllpayment(){
       List<payment> paymentList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Payment");
       paymentList = query.list();
       return paymentList;
   }
   
    @Override
    public void updatepayment(int id ,int oid ,int uid,int type,String status,int transaction_id){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       payment payment = (payment)session.load(payment.class,id);
       payment.setOid(oid);
       payment.setUid(uid);
       payment.setType(type);
       payment.setStatus(status);
       payment.setTransaction_id(transaction_id);
       session.update(payment);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deletepayment(payment payment){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(payment);
       transaction.commit();
       session.close();
  }
    
}
