/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.Category;
/**
 *
 * @author DELL
 */
public interface CategoryDAO {
    public void saveCategory (Category category);
    public List<Category> showAllCategory();
    public void updateCategory (int id,String name);
    public void deleteCategory (Category category);
    
    
    
}
