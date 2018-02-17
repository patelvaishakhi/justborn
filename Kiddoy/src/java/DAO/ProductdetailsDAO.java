/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Productdetails;

/**
 *
 * @author Kalpit Akhawat
 */
public interface ProductdetailsDAO {
    public void saveProductdetails (Productdetails productdetails);
    public List<Productdetails> showAllProductdetails();
    public void updateProductdetails (int P_id, String P_name, String Size , String color ,int Cat_id ,String Stock);
    public void deleteProductdetails (Productdetails productdetails);
}