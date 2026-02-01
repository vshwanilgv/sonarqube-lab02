package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserService {

    // Get password from environment variable for security
    private String password = System.getenv("DB_PASSWORD");

    // Fixed: Using PreparedStatement to prevent SQL Injection
    public void findUser(String username) throws SQLException {

        String query = "SELECT id, name, email FROM users WHERE name = ?";
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db",
                    "root", password != null ? password : "");
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, username);
            pst.executeQuery();
        }
    }

    public void deleteUser(String username) throws SQLException {
        String query = "DELETE FROM users WHERE name = ?";
        
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db","root", password);
             PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, username);
            pst.execute();
        }
    }

}
