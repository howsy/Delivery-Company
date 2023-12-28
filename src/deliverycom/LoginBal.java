/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverycom;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author NSR.I
 */
public class LoginBal {
 
    public String[] LoadUserInfo(){
     
    String UserInfo[]= new String[6];
    
    try{
        String query = "SELECT * FROM users Where username='howsy'";
        
        PreparedStatement pst = DeliveryCom.con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            String id = String.valueOf(rs.getInt("id"));
            String username = rs.getString("username");
            String password = rs.getString("password");
                        String name = rs.getString("name");

                        

            

           UserInfo[0]=id;
           UserInfo[1]=username;
           UserInfo[2]=password;
           UserInfo[3]=name;
           
            
        
        }        
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Erorr: "+e);
    }
        
    
    return UserInfo;
            
            }
    
    
    public boolean checkLogin(String username , String password){
    boolean b = false;
     try {
            String query = "SELECT * FROM `users` WHERE `username` = '"+username+"' AND `password` ='"+password+"'";
            Statement st = DeliveryCom.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()){
            
            b = true;
            
            }else{
            
            JOptionPane.showMessageDialog(null, "Email Or Password is incorrect ..");
            }
            
           
            }
            
            
         catch (Exception ex) {
             
             JOptionPane.showMessageDialog(null, "ERORR :"+ex);
             
         }
     return b;
        
        
    
    }
}
