/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date;
import java.util.List;
import model.Orderdetails;

/**
 *
 * @author DELL
 */
public interface OrderdetailsDAO {
    public void saveOrderdetails (Orderdetails orderdetails);
    public List<Orderdetails> showAllOrderdetails();
    public void updateOrderdetails (int id, int pro_id, int c_id,Date O_date, String delivery_charges);
    public void deleteOrderdetails (Orderdetails orderdetails);
    
}
