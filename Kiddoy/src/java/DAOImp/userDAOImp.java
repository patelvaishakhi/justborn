/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;

import DAO.userDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.user;
/**
 *
 * @author DELL
 */
public class userDAOImp implements userDAO{
   
   @Override
  
   public void saveUser(user usr)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(usr);
       transaction.commit();
       session.close();
   }
     
   @Override
   public List<user> showAllUser(){
       List<user> userList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from user");
       userList = query.list();
       return userList;
   }
   
    @Override
     public void updateUser (int id, String name, String password, String contact, String email, String address){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       user usr = (user)session.load(user.class,id);
       usr.setName(name);
       usr.setPassword(password);
       usr.setContact(contact);
       usr.setEmail(email);
       usr.setAddress(address);
      
       session.update(usr);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteUser (user user){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(user);
       transaction.commit();
       session.close();
  }
   
}
