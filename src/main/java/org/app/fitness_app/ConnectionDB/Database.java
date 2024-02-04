package org.app.fitness_app.ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public Connection CreateConnection(){
        try {
            return DriverManager.getConnection(
                    System.getenv("DB_URL"),
                    System.getenv("DB_USERNAME"),
                    System.getenv("DB_PASSWORD")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
