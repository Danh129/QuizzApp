package com.ltd.quizzappv1;

import com.ltd.utils.MyAlertSingleton;
import com.ltd.utils.themes.ThemeTypes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbthemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       this.cbthemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    public void ManageQuestions(ActionEvent e ){
        //MyAlertSingleton.getInstance().showMsg("[ManageQuestion] comming soon....");
        
    }
    
    public void practice(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("[Practice] comming soon....");
    }
    
    public void exam(ActionEvent e){
        MyAlertSingleton.getInstance().showMsg("[Exam] comming soon....");
    }
    
    public void ChangeTheme(ActionEvent e){
        switch (this.cbthemes.getSelectionModel().getSelectedItem()){
            case DARK: 
                this.cbthemes.getScene().getRoot().getStylesheets().clear();
                this.cbthemes.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                break;
            case LIGHT:
                this.cbthemes.getScene().getRoot().getStylesheets().clear();
                this.cbthemes.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                this.cbthemes.getScene().getRoot().getStylesheets().clear();
                this.cbthemes.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
                break;
        }
    }

    

   
}
