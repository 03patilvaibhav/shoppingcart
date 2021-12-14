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

public class ShoesPage extends MainController{
    @FXML
    private TextField SQuantity1;
    @FXML
    private Text shoesquantity1;
    @FXML
    private TextField SQuantity2;
    @FXML
    private Text shoesquantity2;
    @FXML
    private TextField SQuantity3;
    @FXML
    private Text shoesquantity3;
    @FXML
    private TextField SQuantity4;
    @FXML
    private Text shoesquantity4;
    @FXML
    private TextField SQuantity5;
    @FXML
    private Text shoesquantity5;
    @FXML
    private TextField SQuantity6;
    @FXML
    private Text shoesquantity6;

    @FXML
    private void saddbtn1(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SQuantity1.getText().isBlank()) {
            if (scart1()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoesPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shopper's Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            shoesquantity1.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void saddbtn2(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SQuantity2.getText().isBlank()) {
            if (scart2()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoesPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shopper's Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            shoesquantity2.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void saddbtn3(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SQuantity3.getText().isBlank()) {
            if (scart3()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoesPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shopper's Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            shoesquantity3.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void saddbtn4(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SQuantity4.getText().isBlank()) {
            if (scart4()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoesPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shopper's Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            shoesquantity4.setText("Please Enter Quantity.");
        }
    }

    @FXML
    private void saddbtn5(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SQuantity5.getText().isBlank()) {
            if (scart5()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoesPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shopper's Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            shoesquantity5.setText("Please Enter Quantity.");
        }
    }
    @FXML
    private void saddbtn6(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SQuantity6.getText().isBlank()) {
            if (scart6()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShoesPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shopper's Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            shoesquantity6.setText("Please Enter Quantity.");
        }
    }
    private boolean scart1() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + SQuantity1.getText() + "' WHERE p_name='Adidas Shoes'  ";


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
        private boolean scart2() throws SQLException {
            DatabaseConnector connector = new DatabaseConnector();
            Connection connectDB = connector.getDatabaseLink();

            String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + SQuantity2.getText() + "' WHERE p_name='Woodland Shoes'  ";


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
    private boolean scart3() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + SQuantity3.getText() + "' WHERE p_name='Metro Shoes'  ";


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
    private boolean scart4() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + SQuantity4.getText() + "' WHERE p_name='Puma Shoes'  ";


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
    private boolean scart5() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + SQuantity5.getText() + "' WHERE p_name='Nike Shoes'  ";


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
    private boolean scart6() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='" + SQuantity6.getText() + "' WHERE p_name='Reekbok Shoes'  ";


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
    public void sbackbtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
            stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shopper's Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
