/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.adminDAO;
import java.util.ArrayList;
import java.util.List;
import model.admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author DELL
 */

 public class adminDAOImp implements adminDAO{
   
 @Override
 
   public void saveAdmin(admin Admin)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(Admin);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   
   public List<admin> showAdmin(){
       List<admin> AdminList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from admin");
       AdminList = query.list();
       return AdminList;
       
       
   }
   
    @Override
    public void updateAdmin(int id, String password){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       admin admin = (admin)session.load(admin.class,id);
       admin.setPassword(password);
       session.update(admin);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteAdmin(admin Admin){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(Admin);
       transaction.commit();
       session.close();
  }
}
   

