/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.sub_category;

/**
 *
 * @author DELL
 */
public interface sub_categoryDAO {
      public void savesub_category(sub_category  sub_category);
    public List<sub_category> showAllsub_category();
    public void updatesub_category (int id,int cat_id,String name);
    public void deletesub_category (sub_category sub_category);
}

    

