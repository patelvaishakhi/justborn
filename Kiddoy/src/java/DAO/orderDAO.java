/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.Date;
import java.util.List;
import model.order;
/**
 *
 * @author DELL
 */
public interface orderDAO {
        public void saveOrder (order order);
    public List<order> showOrder();
    public void updateOrder ( int id,int uid,String description,String shipping_address,Date date,int bill_ammount);
    public void deleteOrder (order order);
}
