module com.example.codecadebamie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codecadebamie to javafx.fxml;
    exports com.example.codecadebamie;
}