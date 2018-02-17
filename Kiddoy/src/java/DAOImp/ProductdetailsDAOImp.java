/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.ProductdetailsDAO;
import java.util.ArrayList;
import java.util.List;
import model.Productdetails;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class ProductdetailsDAOImp implements ProductdetailsDAO{
       @Override
   public void saveProductdetails(Productdetails productdetails)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(productdetails);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Productdetails> showAllProductdetails(){
       List<Productdetails> productdetailsList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Productdetails");
       productdetailsList = query.list();
       return productdetailsList;
   }
   
    @Override
    public void updateProductdetails(int P_id, String P_name, String Size , String color ,int Cat_id ,String Stock){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Productdetails productdetails = (Productdetails)session.load(Productdetails.class,P_id);
       productdetails.setName(P_name);
       productdetails.setSize(Size);
       productdetails.setColor(color);
       productdetails.setCat_id(Cat_id);
       productdetails.setStock(Stock);
       session.update(productdetails);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteProductdetails(Productdetails productdetails){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(productdetails);
       transaction.commit();
       session.close();
  }
    
}
