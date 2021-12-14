package application;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import java.sql.Connection;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderPreview extends MainController implements Initializable {
    @FXML
    private TableColumn<OrderTable, Integer> colP_id;
    @FXML
    private TableColumn<OrderTable, String>col_Name;
    @FXML
    private TableColumn<OrderTable, Integer> col_Price;
    @FXML
    private TableColumn<OrderTable, Integer>col_4qty;
    @FXML
    private TableColumn<OrderTable, Float>col_disamt;
    @FXML
    private TableColumn<OrderTable, Float>col_total;
    @FXML
    private TableView<OrderTable> orderview;


    @FXML
    public void backbutton (ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MyCart.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    @FXML
    public void PlaceOrderBtn(ActionEvent mouseEvent) {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("paymentmethod.fxml")));
            stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setTitle("Shoppers Stop");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ObservableList<OrderTable> getDatausers() {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();
        ObservableList<OrderTable> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = connectDB.prepareStatement("select pro_id,p_name,p_price,p_Quantity,dis_amt,p_price*p_Quantity-(p_Quantity*dis_amt) AS total_amt from cart.my_cart WHERE p_Quantity >0 ");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                list.add(new OrderTable(Integer.parseInt(rs.getString("pro_id")), rs.getString("p_name"), Integer.parseInt(rs.getString("p_price")),Integer.parseInt(rs.getString("p_Quantity")),Float.parseFloat(rs.getString("dis_amt")),Float.parseFloat(rs.getString("total_amt"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    ObservableList<OrderTable> listM;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        colP_id.setCellValueFactory (new PropertyValueFactory<>("pro_id"));
        col_Name.setCellValueFactory (new PropertyValueFactory<>("p_name"));
        col_Price.setCellValueFactory (new PropertyValueFactory<>("p_price"));
        col_4qty.setCellValueFactory (new PropertyValueFactory<>("p_Quantity"));
        col_disamt.setCellValueFactory (new PropertyValueFactory<>("dis_amt"));
        col_total.setCellValueFactory (new PropertyValueFactory<>("total_amt"));
        listM = getDatausers();
        orderview.setItems(listM);
    }
}
