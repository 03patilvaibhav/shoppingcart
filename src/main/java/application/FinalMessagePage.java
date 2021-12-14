package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.IOException;
import java.util.Objects;
import java.sql.*;
public class FinalMessagePage extends MainController{
    @FXML
    private void lastbtn (ActionEvent mouseEvent) throws SQLException, IOException {

        if (finalmsg()) {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartScreen.fxml")));
            stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            //stage.show();
            stage.close();
        }
    }


    private boolean finalmsg () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity=0  ";


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
}
