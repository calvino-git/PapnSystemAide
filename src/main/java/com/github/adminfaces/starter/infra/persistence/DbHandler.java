package com.github.adminfaces.starter.infra.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbHandler {
    private static Connection dbConnection;
    public static Connection getDbConnection() {
        try {
            if(dbConnection == null || dbConnection.isClosed()) setDbConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return dbConnection;
    }

    
    private static void setDbConnection() {
        
        final String ConnectionString = "jdbc:oracle:thin:@10.0.55.203:1521:VIRTRE";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(ConnectionString, "ppncargo", "ppncargo");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
