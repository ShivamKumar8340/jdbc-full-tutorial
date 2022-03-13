package com.sunglowsys.insertLargeImage;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertImageL {
    public static void main(String[] args) {
        try {
            Connection c = CreateConn.getConnection();
            String q = "insert into imageL(pic)values(?)";
            PreparedStatement pstmt = c.prepareStatement(q);

            //for insert image at run time
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            jfc.getSelectedFile();
            File file =jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("done.........");
            JOptionPane.showConfirmDialog(null,"success");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
