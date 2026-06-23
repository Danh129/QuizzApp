module com.ltd.quizzappv1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ltd.quizzappv1 to javafx.fxml;
    exports com.ltd.quizzappv1;
}
