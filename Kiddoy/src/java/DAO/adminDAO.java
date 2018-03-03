/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.admin;


/**
 *
 * @author DELL
 */
public interface adminDAO {
      public void saveAdmin (admin Admin);
    public List<admin> showAdmin();
    public void updateAdmin (int id, String password);
    public void deleteAdmin (admin Admin);
    
}
