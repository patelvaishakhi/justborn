/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.orderDAO;
import DAO.orderDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.order;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author DELL
 */
public class orderDAOImp implements orderDAO{
  
     @Override
   public void saveOrder(order order)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(order);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<order> showOrder(){
       List<order> OrderList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from order");
       OrderList = query.list();
       return OrderList;
   }
   
    @Override
    public void updateOrder(int id,int uid,String description,String shipping_address,Date date,int bill_ammount){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       order order = (order)session.load(order.class,id);
       order.setUid(uid);
       order.setDescription(description);
       order.setShipping_address(shipping_address);
       order.setDate(date);
       order.setBill_ammount(bill_ammount);
       session.update(order);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteOrder(order order){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(order);
       transaction.commit();
       session.close();
  }  
}
