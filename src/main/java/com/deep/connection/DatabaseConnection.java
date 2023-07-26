package com.deep.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:postgresql://database-1.ct2jygfmnue8.sa-east-1.rds.amazonaws.com:5432/parkzup";
    private static String user = "postgres";
    private static String password = "catalisa";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
