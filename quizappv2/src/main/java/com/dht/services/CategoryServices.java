/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

import com.dht.pojo.Category;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author admin
 */
public class CategoryServices {
    public List<Category> getCates() throws SQLException{
        String sql = "SELECT + FROM category";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.printf("%d - $s\n", id, name);
    }
}
