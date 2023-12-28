/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverycom;

import static deliverycom.DeliveryCom.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NSR.I
 */
public class PackageBal {
    
    
    
    public List<PackageBean> getAllDataPC3() {
        List<PackageBean> result = new ArrayList<>();
        String query = "SELECT * FROM wsl_data WHERE packageCondition='3'";
        try (PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                // Extract data from the result set
                int id = rs.getInt("id");
                int wslNum = rs.getInt("wslNum");
                String city = rs.getString("city");
                String comstomerName = rs.getString("costomerName");
                long costomerPhoneNum = rs.getLong("CostomerPhoneNum");
                String agentName = rs.getString("agentName");
                String deliveryGuyName = rs.getString("deliveryGuyName");
                String packageCondition = rs.getString("packageCondition");
                int totalPrice = rs.getInt("totalPrice");
                String note = rs.getString("note");

                // Create a PackageBean object and add it to the result list
                PackageBean packageBean = new PackageBean(id, city, wslNum, comstomerName, costomerPhoneNum, agentName, deliveryGuyName, packageCondition, totalPrice, note);
                result.add(packageBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Handle the exception as needed
        }
        return result;
    }
     
     public List<PackageBean> getAllDataPC0() {
        List<PackageBean> result = new ArrayList<>();
        String query = "SELECT * FROM wsl_data WHERE packageCondition='0'";
        try (PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                // Extract data from the result set
                int id = rs.getInt("id");
                int wslNum = rs.getInt("wslNum");
                String city = rs.getString("city");
                String comstomerName = rs.getString("costomerName");
                long costomerPhoneNum = rs.getLong("CostomerPhoneNum");
                String agentName = rs.getString("agentName");
                String deliveryGuyName = rs.getString("deliveryGuyName");
                String packageCondition = rs.getString("packageCondition");
                int totalPrice = rs.getInt("totalPrice");
                String note = rs.getString("note");

                // Create a PackageBean object and add it to the result list
                PackageBean packageBean = new PackageBean(id, city, wslNum, comstomerName, costomerPhoneNum, agentName, deliveryGuyName, packageCondition, totalPrice, note);
                result.add(packageBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Handle the exception as needed
        }
        return result;
    }
    
     public static void add(PackageBean bean){
        
        try{
            
            String query = "INSERT INTO `wsl_data`(`id`, `wslNum`, `city`, `costomerName`, `CostomerPhoneNum`, `agentName`, `deliveryGuyName`, `packageCondition`, `totalPrice`, `note`) VALUES (null,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst = DeliveryCom.con.prepareStatement(query);
            pst.setInt(1,bean.getWslNum() );
            pst.setString(2,bean.getCity() );
                        pst.setString(3,bean.getComstomerName());
            pst.setLong(4,bean.getCostomerPhoneNum() );
                        pst.setString(5,bean.getAgentName() );
                        pst.setString(6,bean.getDeliveryGuyName() );
                        pst.setString(7, bean.getPackageCondition());
                        pst.setInt(8, bean.getTotalPrice());
                        pst.setString(9, bean.getNote());





            
            
            
        
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Record added Successfuly");
            
        
        }catch(Exception e){
        
            JOptionPane.showMessageDialog(null,"Error in add bal :"+e);
        
        }
    }
    
    
    
     public List<PackageBean> loadData(){
    List<PackageBean> list = new ArrayList<PackageBean> ();
    
    try{
        String query = "SELECT * FROM wsl_data";
        
        PreparedStatement pst = DeliveryCom.con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            int id = rs.getInt("id");
            int wslNum = rs.getInt("wslNum");

            String city = rs.getString("city");
     String comstomerName = rs.getString("costomerName");
     int costomerPhoneNum = rs.getInt("CostomerPhoneNum");
     String agentName = rs.getString("agentName");
     String deliveryGuyName = rs.getString("deliveryGuyName");
     String packageCondition = rs.getString("packageCondition");
     int totalPrice = rs.getInt("totalPrice");
     String note = rs.getString("note");
            
    
    PackageBean bean = new PackageBean(id,city, wslNum, comstomerName, costomerPhoneNum, agentName, deliveryGuyName,  packageCondition, totalPrice, note) ;
            
            list.add(bean);
            
        
        }        
    }catch(Exception e){
    
    JOptionPane.showMessageDialog(null, "Erorr: "+e);
    }
        
        
    
        
    
        return list;
    }
    
    
    
}
