package com.sunglowsys.updateRecord;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateR {
    public static void main(String[] args) {
        try {
            Connection c = CreateConn.getConnection();
            String q = "update student set StuName =? ,stuAdd=? where id = ?";

            //using user value
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please enter new StuName");
             String stuName =br.readLine();

            System.out.println("please enter  new StuAdd");
            String stuAdd = br.readLine();

            System.out.println("please enter by witch u want to update ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement psmt = c.prepareStatement(q);
            psmt.setString(1,stuName);

            psmt.setString(2,stuAdd);

            psmt.setInt(3,id);

            psmt.executeUpdate();
            System.out.println("updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
