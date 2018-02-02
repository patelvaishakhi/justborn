/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.Paymentdetails;
/**
 *
 * @author DELL
 */
public interface PaymentdetailsDAO {
    public void saveCategory (Paymentdetails paymentdetails);
    public List<Paymentdetails> showAllPaymentdetails();
    public void updatePaymentdetails (int id, String p_type,String c_id,String o_id,String p_status);
    public void deletePaymentdetails (Paymentdetails paymentdetails);
    
}
