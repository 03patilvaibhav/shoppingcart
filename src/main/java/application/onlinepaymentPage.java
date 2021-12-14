package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class onlinepaymentPage extends MainController{

    @FXML
    private TextField HolderName;
    @FXML
    private TextField cvvNo;
    @FXML
    private TextField debitno;
    @FXML
    private TextField date;
   @FXML
    private Label MessageText;

    @FXML
    private void paybtn(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!HolderName.getText().isBlank() && !cvvNo.getText().isBlank() && !debitno.getText().isBlank() && !date.getText().isBlank() ) {
            if (onlinepaymentPage()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("finalmessage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            MessageText.setText("Please fill all the details.");
        }
    }

    private boolean onlinepaymentPage() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = "INSERT INTO cart.cust_bankdetails (cardholder_name,Cvv_no,debit_no,expiry_date) VALUES('" + HolderName.getText() + "','" + cvvNo.getText() + "','" + debitno.getText() + "'," + date.getText() + ")";

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
}












