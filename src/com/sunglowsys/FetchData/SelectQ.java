package com.sunglowsys.FetchData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQ {
    public static void main(String[] args) {
        try {
            Connection c = CreateConn.getConnection();

            String query = "select * from student";
            Statement statement =c.createStatement();
            ResultSet set = statement.executeQuery(query);
            while (set.next()) {
                int id = set.getInt(1);
                String stuName = set.getString(2);
                String stuAdd = set.getString(3);
                System.out.println(id + ":" + " :" +stuName + " :" +stuAdd);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
