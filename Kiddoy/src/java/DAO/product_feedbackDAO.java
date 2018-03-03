/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.product_feedback;


/**
 *
 * @author DELL
 */
public interface product_feedbackDAO {
      public void saveproduct_feedback(product_feedback product_feedback);
    public List<product_feedback> showAllproduct_feedback();
    public void updateproduct_feedback (int id,int uid,int review_count,String message,String created_date);
    public void deleteproduct_feedback (product_feedback product_feedback);

    
}
	