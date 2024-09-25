package com.exameplat.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect{

    private static String url = "jdbc:mysql://localhost:3306/exame_plataforma";
    private static String user = "genericuser";
    private static String password = "genericpassword";

    private static Connection conn;

    public static Connection getConexao(){
        try {
            if (conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
    }


}