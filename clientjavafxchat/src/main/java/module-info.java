module com.example.clientjavafxchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientjavafxchat to javafx.fxml;
    exports com.example.clientjavafxchat;
}