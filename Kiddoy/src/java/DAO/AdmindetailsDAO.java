/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.Admindetails;


/**
 *
 * @author DELL
 */
public interface AdmindetailsDAO {
    public void saveAdmindetails (Admindetails admindetails);
    public List<Admindetails> showAdmindetails();
    public void updateAdmindetails (int id, String password);
    public void deleteAdmindetails (Admindetails admindetails);
}
