package com.sunglowsys.insertShortSizeImage;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//for insert image if we have file size max 65 kb

public class insertImage {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiceJ","root","root");
            String q = "insert into images(pic) values(?)";
            PreparedStatement pstmt = connection.prepareStatement(q);

            FileInputStream fis = new FileInputStream("fileName.jpg");

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();
            System.out.println("image inserted....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
