package com.sunglowsys.deleteRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteR {
    public static void main(String[] args) {
        try {
            Connection con = CreateConn.getConnection();
            String query = "delete from student where id = ?";
            PreparedStatement psmt = con.prepareStatement(query);
            psmt.setInt(1,8);
            int i = psmt.executeUpdate();
            System.out.println("record deleted successfully");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
