package com.sunglowsys.InsertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceJ","root","root");
            String q = "insert into student(StuName,StuAdd) values (?,?)";

            PreparedStatement pstmt = connection.prepareStatement(q);


            pstmt.setString(1,"ankit");
            pstmt.setString(2,"rampur");

            pstmt.executeUpdate();

            System.out.println("inserted");

            connection.close();




        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
