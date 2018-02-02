/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.Feedback_details;

/**
 *
 * @author DELL
 */
public interface Feedback_detailsDAO {
    public void saveFeedback_details (Feedback_details  feedback_details);
    public List<Feedback_details> showAllFeedback_details();
    public void updateFeedback_details ( int feedback_id, int pro_id,int c_id);
    public void deleteFeedback_details (Feedback_details feedback_details);
    
}
