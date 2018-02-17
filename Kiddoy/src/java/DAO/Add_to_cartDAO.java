/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Add_to_cart;

/**
 *
 * @author Kalpit Akhawat
 */
public interface Add_to_cartDAO {
    public void saveAdd_to_cart (Add_to_cart add_to_cart);
    public List<Add_to_cart> showAllAdd_to_cart();
    public void updateAdd_to_cart (int Add_to_cart_id, int Pro_id, int C_id);
    public void deleteAdd_to_cart (Add_to_cart add_to_cart);
}

