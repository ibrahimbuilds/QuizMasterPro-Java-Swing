/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quiz.database;

import com.quiz.logic.Question;
/**
 *
 * @author ibrah
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseHandler {
   // Global connection string that any frame can access
    public static Connection conn;

    // Simple static method to open the connection
    public static void connect() {
        try {
            if (conn == null || conn.isClosed()) {
                // Your Apache Derby connection configurations
                String url = "jdbc:mysql://localhost:3306/quiz_db"; // Note: Derby default port is usually 1527
                conn = DriverManager.getConnection(url, "root", "h3llo2u!");
                System.out.println("Database connection established successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }

    // Simple static method to fetch questions
    public static List<Question> getQuestionsFromDB() {
        List<Question> list = new ArrayList<>();
        String query = "SELECT * FROM Questions";
        
        // Ensure connection is active before reading data
        connect(); 

        try (Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                String[] opts = {
                    rs.getString("option_a"), 
                    rs.getString("option_b"), 
                    rs.getString("option_c"), 
                    rs.getString("option_d")
                };
                
                // Converts 'A', 'B', 'C', 'D' from the database into 0, 1, 2, 3
                int correctIdx = rs.getString("correct_answer").toUpperCase().charAt(0) - 'A';
                
                list.add(new Question(rs.getInt("id"), rs.getString("question_text"), opts, correctIdx));
            }
        } catch (SQLException e) {
            System.out.println("SQL Error while getting questions: " + e.getMessage());
        }
        return list;
    }

    // New simple method to save student results when quiz ends!
    public static void saveResultToDB(String rollNo, String name, int score) {
        connect();
        String query = "INSERT INTO quiz_results (roll_no, student_name, score) VALUES (?, ?, ?)";
        
        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, rollNo);
            pst.setString(2, name);
            pst.setInt(3, score);
            pst.executeUpdate();
            System.out.println("Result saved to database smoothly!");
        } catch (SQLException e) {
            System.out.println("SQL Error while saving result: " + e.getMessage());
        }
    }
}
