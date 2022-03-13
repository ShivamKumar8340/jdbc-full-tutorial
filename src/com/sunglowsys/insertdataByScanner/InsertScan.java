package com.sunglowsys.insertdataByScanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertScan {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceJ","root","root");
            String q = "insert into student(StuName,StuAdd) values (?,?)";

            PreparedStatement pstmt = connection.prepareStatement(q);

            //for take input from Scanner Class
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println(" please Enter StuName");
            String  StuName=  reader.readLine();

            System.out.println("please Enter StuAdd");
            String StuAdd = reader.readLine();

            pstmt.setString(1,StuName);
            pstmt.setString(2,StuAdd);

            pstmt.executeUpdate();

            System.out.println("inserted");

            connection.close();




        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
