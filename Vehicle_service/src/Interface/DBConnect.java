/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruwan
 */
public class DBConnect {
    
    public static Connection connect()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle_service?","root","");
          //  con=DriverManager.getConnection("jdbc:mysql://192.168.43.3:3306/computer_shop?","root","");
           // JOptionPane.showConfirmDialog(null,"connect to data base");
            
        } catch (Exception e) {
            System.out.println("inter.DBConnect.connect()");
            JOptionPane.showMessageDialog(null, e);
        }
       return con;
    }
    
    
}
