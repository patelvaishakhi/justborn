/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.cartDAO;
import java.util.ArrayList;
import java.util.List;
import model.cart;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class cartDAOImp implements cartDAO{
    
   @Override
   
   public void savecart (cart cat){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(cat);
       transaction.commit();
       session.close();
   }
   
   @Override
   public List<cart> showAllcart(){
       List<cart> cartList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from cart");
       cartList = query.list();
       return cartList;
   }
   
    @Override
      public void updatecart (int id,int uid,int description){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       cart cat = (cart)session.load(cart.class,id);
      // cart.setDescription(description);
       cat.setUid(uid);
       
       session.update(cat);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deletecart(cart cat){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(cat);
       transaction.commit();
       session.close();
  } 
}
