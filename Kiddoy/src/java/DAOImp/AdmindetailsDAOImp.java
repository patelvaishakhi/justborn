/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.AdmindetailsDAO;
import java.util.ArrayList;
import java.util.List;
import model.Admindetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class AdmindetailsDAOImp implements AdmindetailsDAO{
    
   @Override
   public void saveAdmindetails(Admindetails admindetails)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(admindetails);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Admindetails> showAdmindetails(){
       List<Admindetails> admindetailsList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Admindetails");
       admindetailsList = query.list();
       return admindetailsList;
   }
   
    @Override
    public void updateAdmindetails(int id, String password){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Admindetails admindetails = (Admindetails)session.load(Admindetails.class,id);
       admindetails.setPassword(password);
       session.update(admindetails);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteAdmindetails(Admindetails admindetails){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(admindetails);
       transaction.commit();
       session.close();
  }
}


