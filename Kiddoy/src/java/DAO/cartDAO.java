/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.cart;

/**
 *
 * @author DELL
 */
public interface cartDAO {
      
     public void savecart(cart cat);
    public List<cart> showAllcart();
    public void updatecart (int	id,int uid,int description);
    public void deletecart (cart cart);
}
