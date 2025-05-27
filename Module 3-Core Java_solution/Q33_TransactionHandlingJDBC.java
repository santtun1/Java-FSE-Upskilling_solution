// Q33: Transaction Handling in JDBC
// Objective: Use JDBC transactions.
// Task: Simulate a money transfer between two accounts.
// Instructions:
// - Create accounts table with balances.
// - Implement a transfer method with Connection.setAutoCommit(false).
// - Commit if both debit and credit succeed, else rollback.

import java.sql.*;

public class Q33_TransactionHandlingJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "3745kris";

    public static void transferMoney(int fromAccountId, int toAccountId, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                int debitUpdated = debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                int creditUpdated = creditStmt.executeUpdate();

                if (debitUpdated == 1 && creditUpdated == 1) {
                    conn.commit();
                    System.out.println("Transfer successful!");
                } else {
                    conn.rollback();
                    System.out.println("Transfer failed, transaction rolled back.");
                }
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Error during transaction: " + e.getMessage());
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        transferMoney(1, 2, 500.0);
    }
}
