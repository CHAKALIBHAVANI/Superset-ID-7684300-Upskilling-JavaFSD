import java.sql.*;

public class BasicJDBCConnection {

    public static void main(String[] args) {

        // Task details
        String taskName = "Basic JDBC Connection";
        String dbName = "Student Database";

        System.out.println(taskName);
        System.out.println(dbName);

        String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
        String dbUser = "root";
        String dbPassword = "Dinesh@16Dinesh";

        try {
            // Establish connection
            Connection dbConnection = DriverManager.getConnection(
                    dbUrl,
                    dbUser,
                    dbPassword);

            System.out.println("Connection Successful");

            dbConnection.close();

        } catch (Exception error) {
            System.out.println("Connection Error");
            error.printStackTrace();
        }
    }
}