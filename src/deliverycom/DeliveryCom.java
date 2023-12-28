/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliverycom;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author NSR.I
 */
public class DeliveryCom {

     public static Connection con = null ;
    
    public static void LoadConnector() {
    
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/deliverycom","root","");
        
        if(con !=null){
            LoginFor L = new LoginFor();
            L.show();
            
        }
    
    }
    catch(ClassNotFoundException ex){
    
     System.out.println(ex);
    }  catch (Exception ex) {   
        
        JOptionPane.showMessageDialog(null, "Error : "+ex);
    
    }
        
    }
     public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/deliverycom", "root", "");
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Error loading MySQL JDBC driver", ex);
        }
        return connection;
    }

    
    
    public static void main(String[] args) {
        
        LoadConnector();
        

    }
    
}
