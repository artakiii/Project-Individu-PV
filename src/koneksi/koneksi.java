/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;

/**
 *
 * @author Artakii
 */
public class koneksi {
    
public static Connection koneksi;
public Connection connect(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Berhasil Connect");
    }
    catch(ClassNotFoundException ex){
        System.out.println("Gagal Connect"+ex);
    }
    String url= "jdbc:mysql://localhost:3306/penjualan";
    try{
        koneksi=DriverManager.getConnection(url,"root","");
        System.out.println("Berhasil Connect Database");
    }
    catch (SQLException ex){
        System.out.println("Gagal Connect Database"+ex);
    }
    return koneksi;
}
}
