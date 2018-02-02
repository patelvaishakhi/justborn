/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImp;
import DAO.CustomerDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class CustomerDAOImp implements CustomerDAO{
 @Override
   public void saveCustomer(Customer customer)
   {
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.save(customer);
       transaction.commit();
       session.close();
       
   }
   
   @Override
   public List<Customer> showAllCustomer(){
       List<Customer> customer = new ArrayList();
       Session session = HibernateUtil.getSessionFactory().openSession();
       Query query = session.createQuery("from Customer");
       customer = query.list();
       return customer;
   }
   
    @Override
    public void updateCustomer(int id,int contact,Date dob,String password,String gender,String address,String name){
       Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       Customer customer = (Customer)session.load(Customer.class,id);
       customer.setContact(contact);
       customer.setPassword(password);
       customer.setdob(dob);
       customer.setGender(gender);
       customer.setAddress(address);
        customer.setName(name);
       session.update(customer);
       transaction.commit();
       session.close();
       
 }
  @Override
  public void deleteCustomer(Customer customer){
    Session session = HibernateUtil.getSessionFactory().openSession();
       Transaction transaction = session.beginTransaction();
       session.delete(customer);
       transaction.commit();
       session.close();
  }
}

   

