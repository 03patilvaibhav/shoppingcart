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

public class MensWearPage extends MainController{
    @FXML
    private TextField MQuantity1;
    @FXML
    private Text mensquantity1;
    @FXML
    private TextField MQuantity2;
    @FXML
    private Text mensquantity2;
    @FXML
    private TextField MQuantity3;
    @FXML
    private Text  mensquantity3;
    @FXML
    private TextField MQuantity4;
    @FXML
    private Text mensquantity4;
    @FXML
    private TextField MQuantity5;
    @FXML
    private Text mensquantity5;
    @FXML
    private TextField MQuantity6;
    @FXML
    private Text mensquantity6;
    @FXML
    private void maddbtn1(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!MQuantity1.getText().isBlank()) {
            if (mcart1()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MensWear.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            mensquantity1.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void maddbtn2(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!MQuantity2.getText().isBlank()) {
            if (mcart2()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MensWear.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            mensquantity2.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void maddbtn3(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!MQuantity3.getText().isBlank()) {
            if (mcart3()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MensWear.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            mensquantity3.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void maddbtn4(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!MQuantity4.getText().isBlank()) {
            if (mcart4()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MensWear.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            mensquantity4.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void maddbtn5(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!MQuantity5.getText().isBlank()) {
            if (mcart5()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MensWear.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            mensquantity5.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void maddbtn6(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!MQuantity6.getText().isBlank()) {
            if (mcart6()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MensWear.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            mensquantity6.setText("Please Enter Quantity.");
        }
    }
    private boolean mcart1() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + MQuantity1.getText() + "' WHERE p_name='Fendi Shirt'  ";


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
    private boolean mcart2() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + MQuantity2.getText() + "' WHERE p_name='Brown TShirt'  ";


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
    private boolean mcart3() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + MQuantity3.getText() + "' WHERE p_name='Jeans'  ";


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
    private boolean mcart4() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + MQuantity4.getText() + "' WHERE p_name='Black Jacket'  ";


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
    private boolean mcart5() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + MQuantity5.getText() + "' WHERE p_name='Blue Suit'  ";


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
    private boolean mcart6() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + MQuantity6.getText() + "' WHERE p_name='Arrow Shirt'  ";


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
    public void mbackbtn(ActionEvent mouseEvent) {
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
