
// Transaction Handling in JDBC
import java.sql.*;

public class MoneyTransfer {

        public static void main(String[] args) {

                String taskTitle = "Money Transfer Transaction";

                String bankName = "Demo Bank";

                boolean transactionStarted = true;

                System.out.println(taskTitle);
                System.out.println(bankName);

                try {

                        Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://localhost:3306/bankdb",
                                        "root",
                                        "your_password");

                        // Start transaction
                        con.setAutoCommit(false);

                        PreparedStatement debit = con.prepareStatement(
                                        "UPDATE accounts SET balance=balance-500 WHERE id=1");

                        PreparedStatement credit = con.prepareStatement(
                                        "UPDATE accounts SET balance=balance+500 WHERE id=2");

                        debit.executeUpdate();
                        credit.executeUpdate();

                        // Save changes
                        con.commit();

                        System.out.println(
                                        "Money Transferred Successfully");

                        con.close();

                } catch (Exception e) {

                        System.out.println("Transaction Failed");
                }
        }
}