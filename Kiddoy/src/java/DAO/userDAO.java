/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import model.user;

/**
 *
 * @author DELL
 */
public interface userDAO {
     public void saveUser (user user);
    public List<user> showAllUser();
    public void updateUser (int id,String name,String password,String contact,String email,String address);
    public void deleteUser (user user);
}
