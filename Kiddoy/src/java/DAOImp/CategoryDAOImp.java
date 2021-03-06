/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.categoryDAO;
import java.util.ArrayList;
import java.util.List;
import model.category;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class CategoryDAOImp implements categoryDAO{
    
     @Override
   public void saveCategory(category category)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(category);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<category> showCategory(){
       List<category> categoryList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from category");
       categoryList = query.list();
       return categoryList;
   }
   
    @Override
    public void updateCategory(int id, String name){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       category category = (category)session.load(category.class,id);
       category.setName(name);
       session.update(category);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteCategory(category category){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(category);
       transaction.commit();
       session.close();
  }
}

    
