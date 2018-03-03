/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.productDAO;
import DAO.productDAO;
import java.util.ArrayList;
import java.util.List;
import model.product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author DELL
 */
public class productDAOImp implements productDAO{
    @Override
   public void saveProduct(product product)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(product);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<product> showAllProduct(){
       List<product> productList = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from product");
       productList = query.list();
       return productList;
   }
   
    @Override
    public void updateProduct(int id, String name, String description , int price ,int color ,int cat_id,int Stock){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       product product = (product)session.load(product.class,id);
       product.setName(name);
       product.setDescription(description);
       product.setPrice(price);
       product.setColor(color);
       product.setCat_id(cat_id);
       product.setStock(Stock);
       session.update(product);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteProduct(product product){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(product);
       transaction.commit();
       session.close();
  }
}
