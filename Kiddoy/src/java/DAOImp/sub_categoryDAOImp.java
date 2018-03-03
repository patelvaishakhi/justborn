/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.sub_categoryDAO;
import java.util.ArrayList;
import java.util.List;
import model.sub_category;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class sub_categoryDAOImp implements sub_categoryDAO{
    @Override
   public void savesub_category(sub_category sub_category)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(sub_category);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<sub_category> showAllsub_category(){
       List<sub_category> categoryList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from sub_category");
       categoryList = query.list();
       return categoryList;
   }
   
    @Override
    public void updatesub_category(int id,int cat_id,String name){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       sub_category sub_category = (sub_category)session.load(sub_category.class,id);
       sub_category.setName(name);
       sub_category.setCat_id(cat_id);
       session.update(sub_category);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deletesub_category(sub_category sub_category){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(sub_category);
       transaction.commit();
       session.close();
  }
}
