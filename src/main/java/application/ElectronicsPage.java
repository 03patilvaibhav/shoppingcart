package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.IOException;
import java.util.Objects;
import java.sql.*;

public class ElectronicsPage extends MainController{

    @FXML
    private TextField Quantity1;
    @FXML
    private Label QuantityText1;
    @FXML
    private TextField Quantity2;
    @FXML
    private Label QuantityText2;
    @FXML
    private TextField Quantity3;
    @FXML
    private Label QuantityText3;
    @FXML
    private TextField Quantity4;
    @FXML
    private Label QuantityText4;
    @FXML
    private TextField Quantity5;
    @FXML
    private Label QuantityText5;
    @FXML
    private TextField Quantity6;
    @FXML
    private Label QuantityText6;


    @FXML
    private void addbtn1(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!Quantity1.getText().isBlank()) {
            if (mycart1()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            QuantityText1.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void addbtn2 (ActionEvent mouseEvent) throws SQLException, IOException {
        if (!Quantity2.getText().isBlank()) {
            if (mycart2()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            QuantityText2.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void addbtn3 (ActionEvent mouseEvent) throws SQLException, IOException {
        if (!Quantity2.getText().isBlank()) {
            if (mycart3()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            QuantityText3.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void addbtn4 (ActionEvent mouseEvent) throws SQLException, IOException {
        if (!Quantity2.getText().isBlank()) {
            if (mycart4()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            QuantityText4.setText("Pleaseenterthequantity.");
        }
    }
    @FXML
    private void addbtn5 (ActionEvent mouseEvent) throws SQLException, IOException {
        if (!Quantity2.getText().isBlank()) {
            if (mycart5()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            QuantityText5.setText("Pleaseenterthequantity.");
        }
    }
    @FXML
    private void addbtn6 (ActionEvent mouseEvent) throws SQLException, IOException {
        if (!Quantity2.getText().isBlank()) {
            if (mycart6()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            QuantityText6.setText("Pleaseenterthequantity.");
        }
    }

    private boolean mycart1 () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+Quantity1.getText()+"' WHERE p_name='IPhone 13 Pro'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }

    private boolean mycart2 () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+Quantity2.getText()+"' WHERE p_name='Dell XPS 17'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean mycart3 () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+Quantity3.getText()+"' WHERE p_name='Mac Book Pro'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean mycart4 () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+Quantity4.getText()+"' WHERE p_name='Samsung TabS7+'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean mycart5  () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+Quantity5.getText()+"' WHERE p_name='IPad Pro'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean mycart6 () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+Quantity6.getText()+"' WHERE p_name='Samsung 8K T.V.'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    @FXML
    public void elebackbtn (ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
            stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
