package com.sunglowsys.deleteRecord;

import java.sql.Connection;
import java.sql.DriverManager;

//create connection saperatly
public class CreateConn {
    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection==null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceJ","root","root");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
