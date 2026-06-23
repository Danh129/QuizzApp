/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltd.utils;

import com.ltd.utils.themes.ThemeTypes;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class MyStageSingleton {
    
    private static MyStageSingleton instance;
    
    private final Stage stage;
    
    private MyStageSingleton(){
        this.stage = new Stage();
        this.stage.setTitle("Quizz App");
        
    }
    
    public static MyStageSingleton getInstance(){
        if(instance == null)
            instance = new MyStageSingleton();
        
        return instance;
    }
    
    public void showStage(String fxml){
        if(!this.stage.isShowing()){
            Scene scene = new Scene(new FXMLLoader(App.class.getResource(fxml + ".fxml")).load());
            
            ThemeTypes.applyTheme(scene);
            
            this.stage.setScene(scene);       
            this.stage.show();
        }
           
        
    }
}
