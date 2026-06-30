package com.dht.quizappv2;

import com.dht.pojo.Category;
import com.dht.pojo.Question;
import com.dht.pojo.Level; 
import com.dht.services.CategoryServices;
import com.dht.services.LevelServices;
import com.dht.services.QuestionServices;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Logger; 

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    @FXML private TableView<Question> tvQuestions;
    @FXML private VBox vChoice;
    @FXML private ComboBox<Level> cbLevels;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.loadColumns();
        
        CategoryServices s = new CategoryServices();
        QuestionServices questionService = new QuestionServices();
        LevelServices lvlService = new LevelServices();        
        try {
            this.cbCates.setItems(FXCollections.observableList(s.getCates()));
            this.tvQuestions.setItems(FXCollections.observableList(questionService.getQuestions(null)));        
            this.cbLevels.setItems(FXCollections.observableArrayList(lvlService.getLevels()));
            
        } catch (SQLException ex) {
            Logger.getLogger(QuestionsController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }    
    
    public void loadColumns() {
        TableColumn colId = new TableColumn("Id");
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colId.setPrefWidth(80);
        
        TableColumn colContent = new TableColumn("Nội dung câu hỏi");
        colContent.setCellValueFactory(new PropertyValueFactory<>("content"));
        colContent.setPrefWidth(80);
        
        this.tvQuestions.getColumns().addAll(colId, colContent);
    }
    
    public void addChoice(){
        HBox h = new HBox();
        h.getStyleClass().add("Container");
        
        RadioButton rdo = new RadioButton();
        TextField txt = new TextField();
        txt.getStyleClass().add("input");
        
        h.getChildren().addAll(rdo, txt);
        this.vChoice.getChildren().add(h);
    }
}