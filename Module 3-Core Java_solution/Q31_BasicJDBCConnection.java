// Q31: Basic JDBC Connection
// Objective: Connect Java with a relational database.
// Task: Connect to a local MySQL/SQLite database and retrieve data.
// Instructions:
// - Set up a database with a students table.
// - Write code to load the JDBC driver, create a connection, execute a SELECT query, and print results.

// Note: Adjust connection URL, username, password and ensure JDBC driver is available.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q31_BasicJDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";  
        String user = "root";
        String password = "3745kris";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM students");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
