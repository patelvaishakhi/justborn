/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.CategoryDAO;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class CategoryDAOImp implements CategoryDAO{
    
     @Override
   public void saveCategory(Category category)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(category);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Category> showAllCategory(){
       List<Category> CategoryList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Category");
       CategoryList = query.list();
       return CategoryList;
   }
   
    @Override
    public void updateCategory(int id, String name){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Category category = (Category)session.load(Category.class,id);
       category.setName(name);
       session.update(category);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteCategory(Category category){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(category);
       transaction.commit();
       session.close();
  }
}

    
