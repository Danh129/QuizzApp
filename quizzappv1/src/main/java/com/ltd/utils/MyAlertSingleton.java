/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.utils;

import javafx.scene.control.Alert;

/**
 *
 * @author admin
 */
public class MyAlertSingleton {
    private static MyAlertSingleton instance;   
    private final Alert alert;
    
    private MyAlertSingleton(){
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("quizzApp");
        alert.setHeaderText("Quizz App");
    }
    
    public static MyAlertSingleton getInstance(){
        if(instance == null)
            instance = new MyAlertSingleton();
        return instance;
    }
    
    public void showMsg(String content){
        this.alert.setContentText(content);
        this.alert.show();
    }
}
