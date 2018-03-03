/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.category;

/**
 *
 * @author DELL
 */
public interface categoryDAO {
         public void saveCategory (category category);
    public List<category> showCategory();
    public void updateCategory (int id, String name);
    public void deleteCategory (category category);
    
    
}
