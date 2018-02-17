/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.Add_to_cartDAO;
import DAO.PaymentdetailsDAO;
import java.util.ArrayList;
import java.util.List;
import model.Add_to_cart;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class Add_to_cartDAOImp implements Add_to_cartDAO{
   @Override
   public void saveAdd_to_cart(Add_to_cart add_to_cart)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(add_to_cart);
       transaction.commit();
       session.close();
   }
   
   @Override
   public List<Add_to_cart> showAllAdd_to_cart(){
       List<Add_to_cart> add_to_cartList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Add_to_cart");
       add_to_cartList = query.list();
       return add_to_cartList;
   }
   
    @Override
    public void updateAdd_to_cart(int Add_to_cart_id, int Pro_id, int C_id){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Add_to_cart add_to_cart = (Add_to_cart)session.load(Add_to_cart.class,Add_to_cart_id);
       add_to_cart.setPro_id(Pro_id);
       add_to_cart.setC_id(C_id);
       session.update(add_to_cart);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteAdd_to_cart(Add_to_cart add_to_cart){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(add_to_cart);
       transaction.commit();
       session.close();
  }
}

 

