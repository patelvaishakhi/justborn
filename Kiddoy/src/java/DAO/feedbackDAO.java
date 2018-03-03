/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.feedback;


/**
 *
 * @author DELL
 */
public interface feedbackDAO {
     public void updateFeedback (int id,String name,String email,int contact,int subject,int message,int created_at);
     public void saveFeedback (feedback feedback);
    public List<feedback> showAllFeedback();
    public void deletFeedback (feedback feedback);
    
}
    