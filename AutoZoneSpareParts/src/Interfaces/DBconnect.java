/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ccs
 */
class DBconnect {
     public static Connection connect()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/autozone?","root","");
           // JOptionPane.showConfirmDialog(null,"connect to data base");
            
        } catch (Exception e) {
            //System.out.println("inter.DBConnect.connect()");
            JOptionPane.showMessageDialog(null, e+"aaaa");
        }
       return con;
    }
    
}
