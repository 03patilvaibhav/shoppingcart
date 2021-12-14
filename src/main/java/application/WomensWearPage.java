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
import java.sql.*;

public class WomensWearPage extends MainController {
    @FXML
    private TextField WQuantity1;
    @FXML
    private Text WQuantity1Text;
    @FXML
    private TextField WQuantity2;
    @FXML
    private Text WQuantity2Text;
    @FXML
    private TextField WQuantity3;
    @FXML
    private Text WQuantity3Text;
    @FXML
    private TextField WQuantity4;
    @FXML
    private Text WQuantity4Text;
    @FXML
    private TextField WQuantity5;
    @FXML
    private Text WQuantity5Text;
    @FXML
    private TextField WQuantity6;
    @FXML
    private Text WQuantity6Text;


    @FXML
    private void waddbtn1(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!WQuantity1.getText().isBlank()) {
            if (wcart1()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WomensWearPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            WQuantity1Text.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void waddbtn2(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!WQuantity2.getText().isBlank()) {
            if (wcart2()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WomensWearPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            WQuantity2Text.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void waddbtn3(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!WQuantity3.getText().isBlank()) {
            if (wcart3()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WomensWearPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            WQuantity3Text.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void waddbtn4(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!WQuantity4.getText().isBlank()) {
            if (wcart4()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WomensWearPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            WQuantity4Text.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void waddbtn5(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!WQuantity5.getText().isBlank()) {
            if (wcart5()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WomensWearPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            WQuantity5Text.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void waddbtn6(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!WQuantity6.getText().isBlank()) {
            if (wcart6()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("WomensWearPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            WQuantity6Text.setText("Please Enter Quantity.");
        }
    }

    private boolean wcart1() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + WQuantity1.getText() + "' WHERE p_name='White Shirt'  ";


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

    private boolean wcart2() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + WQuantity2.getText() + "' WHERE p_name='Tshirt'  ";


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

    private boolean wcart3() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + WQuantity3.getText() + "' WHERE p_name='Blue Dress'  ";


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

    private boolean wcart4() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + WQuantity4.getText() + "' WHERE p_name='Pink Dress'  ";


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

    private boolean wcart5() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + WQuantity5.getText() + "' WHERE p_name='DEATU dress'  ";


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

    private boolean wcart6() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + WQuantity6.getText() + "' WHERE p_name='Black Dress'  ";


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
    public void wbackbtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
            stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("MY YATRA");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


















