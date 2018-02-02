/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date;
import java.util.List;
import model.Customer;

/**
 *
 * @author DELL
 */
public interface CustomerDAO {
     public void saveCustomer (Customer customer);
    public List<Customer> showAllCustomer();
    public void updateCustomer (int id,int contact,Date dob,String password,String gender,String address,String name);
    public void deleteCustomer (Customer customer);
}
