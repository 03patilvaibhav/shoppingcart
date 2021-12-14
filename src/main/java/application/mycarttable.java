package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.sql.*;

public class mycarttable extends MainController implements Initializable {
    @FXML
    private TableColumn<cartdetail, Integer> pIDcolumn1;
    @FXML
    private TableColumn<cartdetail, String> p_namecoloumn2;
    @FXML
    private TableColumn<cartdetail, String> p_priceColoumn3;
    @FXML
    private TableColumn<cartdetail, Integer> p_quantitycoloumn4;
    @FXML
    private TableView<cartdetail> CARTTableview;
    @FXML
    private TextField deleteText;
    @FXML
    private Label deletemessageText;

    public static ObservableList<cartdetail> getDatausers () {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();
        ObservableList<cartdetail> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = connectDB.prepareStatement("select * from cart.my_cart WHERE p_Quantity > 0");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new cartdetail(Integer.parseInt(rs.getString("pro_id")), rs.getString("p_name"), rs.getString("p_price"), Integer.parseInt(rs.getString("p_Quantity"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    ObservableList<cartdetail> listZ;

    @FXML
    public void confirmOrderbtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("orderpreveiw.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void cartbackbtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void deletebtn(ActionEvent mouseEvent)  throws SQLException, IOException {
        if (!deleteText.getText().isBlank()) {
            if (DeleteDetails()) {


                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MyCart.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }  else{
                    deletemessageText.setText("Please Enter product NAME.");
                }

            }
        }

    private boolean DeleteDetails() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails =" UPDATE cart.my_cart SET p_Quantity='0' WHERE p_name='"+deleteText.getText()+"'  ";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(insertDetails);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {

                    return true;
                } else {
                    deletemessageText.setText("Product Not Found.");
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }
        @Override

        public void initialize (URL url, ResourceBundle resourceBundle){
            pIDcolumn1.setCellValueFactory(new PropertyValueFactory<>("pro_id"));
            p_namecoloumn2.setCellValueFactory(new PropertyValueFactory<>("p_name"));
            p_priceColoumn3.setCellValueFactory(new PropertyValueFactory<>("p_price"));
            p_quantitycoloumn4.setCellValueFactory(new PropertyValueFactory<>("p_Quantity"));

            listZ = getDatausers();
            CARTTableview.setItems(listZ);
        }
    }


