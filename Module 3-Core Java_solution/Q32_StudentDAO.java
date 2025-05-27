// Q32: Insert and Update Operations in JDBC
// Objective: Perform insert/update SQL queries from Java.
// Task: Add and modify student data using JDBC.
// Instructions:
// - Create a StudentDAO class.
// - Implement methods to insert new records and update student details.
// - Use PreparedStatement for parameterized queries.

import java.sql.*;

public class Q32_StudentDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/school"; 
    private static final String USER = "root";   
    private static final String PASSWORD = "3745kris"; 

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Method to insert a new student record
    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update student details by ID
    public void updateStudent(int id, String name, int age) {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);

            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student details updated successfully!");
            } else {
                System.out.println("No student found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Q32_StudentDAO dao = new Q32_StudentDAO();

        // Insert a new student
        dao.insertStudent(1, "John Doe", 20);

        // Update student details
        dao.updateStudent(1, "John Smith", 21);
    }
}
