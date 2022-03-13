package com.sunglowsys.createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTab {
    public static void main(String[] args) {
        try {
            //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceJ","root","root");
            //create query
            String q = "create table student(id int(10) primary key auto_increment,StuName varchar(20) not null,StuAdd varchar(20))";
            //create statement
            Statement statement = connection.createStatement();
            //execute query
            statement.executeUpdate(q);
            System.out.println("table created .........");
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
