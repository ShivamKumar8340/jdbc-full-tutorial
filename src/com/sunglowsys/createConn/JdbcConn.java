package com.sunglowsys.createConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConn {
    public static void main(String[] args) {
        try{
            //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection
            String url = "jdbc:mysql://localhost:3306/practiceJ";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed()) {
                System.out.println("connection is closed");
            }
            else{
                System.out.println("connection is started");
            }


        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
