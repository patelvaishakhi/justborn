/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.OrderdetailsDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Orderdetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author DELL
 */
public class OrderdetailsDAOImp implements OrderdetailsDAO{
     @Override
   public void saveOrderdetails(Orderdetails orderdetails)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(orderdetails);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Orderdetails> showAllOrderdetails(){
       List<Orderdetails> OrderdetailsList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Orderdetails");
       OrderdetailsList = query.list();
       return OrderdetailsList;
   }
   
    @Override
    public void updateOrderdetails(int id, int pro_id, int c_id,Date O_date, String delivery_charges){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Orderdetails orderdetails = (Orderdetails)session.load(Orderdetails.class,id);
       orderdetails.setPro_id(pro_id);
       orderdetails.setC_id(c_id);
       orderdetails.setO_date(O_date);
       orderdetails.setDelivery_charges(delivery_charges);
       session.update(orderdetails);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteOrderdetails(Orderdetails orderdetails){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(orderdetails);
       transaction.commit();
       session.close();
  }
}



    

