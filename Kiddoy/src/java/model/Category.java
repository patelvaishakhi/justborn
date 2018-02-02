/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


    import java.io.Serializable;
    import javax.persistence.GeneratedValue;
    import javax.persistence.Id;

/**
 *
 * @author Kalpit Akhawat
 */
public class Category implements Serializable
{
    @Id @GeneratedValue
    int id;
    
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
