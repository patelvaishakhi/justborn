/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.payment;
/**
 *
 * @author DELL
 */
public interface paymentDAO {
    public void savepayment (payment payment);
    public List<payment> showAllpayment();
    public void updatepayment(int id ,int oid ,int uid,int type,String status,int transaction_id);
    public void deletepayment (payment payment);
     
}

