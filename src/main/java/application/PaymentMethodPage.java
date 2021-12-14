package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.Objects;


public class PaymentMethodPage extends MainController {
    @FXML
    public void UPIBtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("upipayment.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void debitcardbtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("onlinepaymentpage.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void cashbtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("finalmessage.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
