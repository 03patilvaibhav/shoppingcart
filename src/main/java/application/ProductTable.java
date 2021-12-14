package application;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

public class ProductTable extends  MainController implements Initializable {
    @FXML
    private TableColumn<Searchtable, Integer> colP_id;
    @FXML
    private TableColumn<Searchtable, String>colName;
    @FXML
    private TableColumn<Searchtable, Integer> colPrice;
    @FXML
    private TableColumn<Searchtable, String>col4desc;
    @FXML
    private TableView<Searchtable> searchview;
    @FXML
    private TextField enterQuantity;
    @FXML
    private Text searchquantityText;
    @FXML
    private  TextField SearchText;
    @FXML
    private  Label Searchmessage;


    public static ObservableList<Searchtable> getDatausers() {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();
        ObservableList<Searchtable> list = FXCollections.observableArrayList();
        try {
            PreparedStatement ps = connectDB.prepareStatement("select * from cart.products ");
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                list.add(new Searchtable(Integer.parseInt(rs.getString("pro_id")), rs.getString("pro_name"), Integer.parseInt(rs.getString("pro_price")),rs.getString("pro_desc")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    ObservableList<Searchtable> listM;

    @FXML
    public void searchbackbtn(ActionEvent mouseEvent) {
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
    private void searchaddbtn (ActionEvent mouseEvent) throws SQLException, IOException {
        if (!enterQuantity.getText().isBlank()) {
            if (searchmethod()) {
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ElectronicsPage.fxml")));
                stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } else {
            searchquantityText.setText("Please Enter Quantity.");
        }
    }
    private boolean searchmethod () throws SQLException{
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();

        String insertDetails = " UPDATE cart.my_cart SET p_Quantity='"+enterQuantity.getText()+"' WHERE p_name= colName.setCellValueFactory (new PropertyValueFactory<>(\"pro_name\"))  ";


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

    @FXML
    private void okbtn(ActionEvent mouseEvent) throws SQLException, IOException {
        if (!SearchText.getText().isBlank()) {
            if (SearchValidate()) {


                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SearchItemPage.fxml")));
                stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                stage.setTitle("Shoppers Stop");
                stage.setScene(new Scene(root));
                stage.show();
            } else {
                Searchmessage.setText("Please Search again.");
            }
        }
    }
    private  boolean SearchValidate() throws SQLException {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connectDB = connector.getDatabaseLink();
        PreparedStatement pst = null;

        String verifySearch = "SELECT count(1) FROM cart.products WHERE pro_name ='" + SearchText.getText() + "'";

        try {
            pst = connectDB.prepareStatement(verifySearch);
            pst.execute();
            return true;



                }

         catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return false;
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        colP_id.setCellValueFactory (new PropertyValueFactory<>("pro_id"));
        colName.setCellValueFactory (new PropertyValueFactory<>("pro_name"));
        colPrice.setCellValueFactory (new PropertyValueFactory<>("pro_price"));
        col4desc.setCellValueFactory (new PropertyValueFactory<>("pro_desc"));

        listM = getDatausers();
        searchview.setItems(listM);
    }

}
