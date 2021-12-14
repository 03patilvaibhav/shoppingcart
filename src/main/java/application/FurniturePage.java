package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class FurniturePage extends MainController{
    @FXML
    private TextField FQuantity1;
    @FXML
    private Text chairquantity1;
    @FXML
    private TextField FQuantity2;
    @FXML
    private Text chairquantity2;
    @FXML
    private TextField FQuantity3;
    @FXML
    private Text chairquantity3;
    @FXML
    private TextField FQuantity4;
    @FXML
    private Text chairquantity4;
    @FXML
    private TextField FQuantity5;
    @FXML
    private Text chairquantity5;
    @FXML
    private TextField FQuantity6;
    @FXML
    private Text chairquantity6;

    @FXML
    private void faddbtn1(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!FQuantity1.getText().isBlank()) {
            if (fcart1()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FurniturePage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            chairquantity1.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void faddbtn2(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!FQuantity2.getText().isBlank()) {
            if (fcart2()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FurniturePage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            chairquantity2.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void faddbtn3(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!FQuantity3.getText().isBlank()) {
            if (fcart3()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FurniturePage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            chairquantity3.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void faddbtn4(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!FQuantity4.getText().isBlank()) {
            if (fcart4()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FurniturePage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            chairquantity4.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void faddbtn5(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!FQuantity5.getText().isBlank()) {
            if (fcart5()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FurniturePage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            chairquantity5.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void faddbtn6(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!FQuantity6.getText().isBlank()) {
            if (fcart6()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FurniturePage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            chairquantity6.setText("Please Enter Quantity.");
        }
    }
    private boolean fcart1() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + FQuantity1.getText() + "' WHERE p_name='Bed'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean fcart2() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + FQuantity2.getText() + "' WHERE p_name='Chair'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean fcart3() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + FQuantity3.getText() + "' WHERE p_name='Sofa and Chair'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean fcart4() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + FQuantity4.getText() + "' WHERE p_name='Almirah'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean fcart5() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + FQuantity5.getText() + "' WHERE p_name='Dining Table'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
    private boolean fcart6() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + FQuantity6.getText() + "' WHERE p_name='Sofa'  ";


        try {
            Statement statement = connectDB.createStatement();
            int a = statement.executeUpdate(insertDetails);
            if (a == 1) {

                return true;
            }


        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }

    @FXML
    public void fbackbtn (ActionEvent mouseEvent) {
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







