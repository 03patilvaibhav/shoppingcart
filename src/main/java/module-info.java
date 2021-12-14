module com.example.shoppingcart {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;
    requires mysql.connector.java;


    opens application to javafx.fxml;
    exports application;
}