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
public class Productdetails implements Serializable
{
    @Id @GeneratedValue
    int id;
    String size;
    String color;
    String stock;
    int Cat_id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getCat_id() {
        return Cat_id;
    }

    public void setCat_id(int Cat_id) {
        this.Cat_id = Cat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
