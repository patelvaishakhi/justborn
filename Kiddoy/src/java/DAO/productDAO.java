/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.product;

/**
 *
 * @author DELL
 */
public interface productDAO {
    
     public void saveProduct(product product);
    public List<product> showAllProduct();
    public void updateProduct (int id, String name, String description , int price ,int color ,int cat_id,int Stock);
    public void deleteProduct (product product);
}

