package application;



import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnector {
    public Connection databaseLink;

    public Connection getDatabaseLink() {
        String databaseName = "cart";
        String databaseUser = "root";
        String databasePassword = "";

        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println("DB Connection done !");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("DB Connection Failures !");
        }

        return databaseLink;
    }
}
