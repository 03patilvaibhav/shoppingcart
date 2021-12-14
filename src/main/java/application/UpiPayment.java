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

public class UpiPayment extends MainController {
    @FXML
    private TextField upiIdText;
    @FXML
    private TextField upiPinText;
    @FXML
    private Text upiMessageText;

    @FXML
    private void upipaybtn(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!upiIdText.getText().isBlank() && !upiPinText.getText().isBlank()  ) {
            if (onlinepaymentPage()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("finalmessage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            upiMessageText.setText("Please fill all the details.");
        }
    }
    private boolean onlinepaymentPage() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = "INSERT INTO cart.cust_bankdetails (UPI_Id,Upi_Pin) VALUES('" + upiIdText.getText() + "'," + upiPinText.getText() + ")";

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
