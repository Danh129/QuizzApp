/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.services;

import com.dht.pojo.Level;
import com.dht.pojo.Question;
import com.dht.utils.MyConnSingleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LevelServices {
     public List<Level> getLevels() throws SQLException {
        String sql = "SELECT * FROM question";
        PreparedStatement stm = MyConnSingleton.getInstance().connect().prepareCall(sql);
        ResultSet rs = stm.executeQuery();
        
        List<Level> level = new ArrayList<>();
        while (rs.next()) {
            level.add(new Level(rs.getInt("id"), rs.getString("name")));
        }
        
        return level;
    }
}
