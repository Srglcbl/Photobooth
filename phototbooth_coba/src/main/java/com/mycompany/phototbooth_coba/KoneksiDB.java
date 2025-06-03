/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phototbooth_coba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class KoneksiDB {
    public static Connection koneksi;
    public static Connection KonfigDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/photobooth";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "Berhasil koneksi");
        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Gagal koneksi");
            System.err.println("koneksi gagal" +e.getMessage());
        }
        return koneksi;
    }
}

