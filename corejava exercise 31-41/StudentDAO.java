//Insert and Update Operations in JDBC 
import java.sql.*;

public class StudentDAO {

    static String url = "jdbc:mysql://localhost:3306/studentdb";
    static String user = "root";
    static String password = "your_password";

    // Insert student record
    static void addStudent(int id, String name) throws Exception {

        Connection con =
                DriverManager.getConnection(url, user, password);

        PreparedStatement ps =
                con.prepareStatement(
                        "INSERT INTO students VALUES (?, ?)");

        ps.setInt(1, id);
        ps.setString(2, name);

        ps.executeUpdate();
        con.close();
    }

    // Update student record
    static void updateStudent(int id, String newName)
            throws Exception {

        Connection con =
                DriverManager.getConnection(url, user, password);

        PreparedStatement ps =
                con.prepareStatement(
                        "UPDATE students SET name=? WHERE id=?");

        ps.setString(1, newName);
        ps.setInt(2, id);

        ps.executeUpdate();
        con.close();
    }

    public static void main(String[] args) {

        String taskTitle =
                "Insert and Update Operations";

        String operationType =
                "Student Record Management";

        int totalOperations = 2;

        try {

            addStudent(101, "Bhavani");
            updateStudent(101, "Ch Bhavani");

            System.out.println(taskTitle);
            System.out.println(operationType);
            System.out.println(
                    "Operations Done : "
                            + totalOperations);

        } catch (Exception e) {
            System.out.println("Database Error");
        }
    }
}