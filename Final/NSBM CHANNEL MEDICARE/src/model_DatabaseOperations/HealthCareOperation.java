/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class HealthCareOperation {
//     public static String  url="jdbc:mysql://localhost:3306/healthcaredb";
//     public static String user="root";
//     public static  String  password = ""; 
    public static void showTableData(JTable appointmentTable) throws SQLException{
   try {
           Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(" ClassNotFoundException found in doctor /nurse care showTableData function "+HealthCareOperation.class.getName()).log(Level.SEVERE, null, ex);
         }
//         Connection conn = DriverManager.getConnection(url, user,password);
          Connection conn = DBConnection.connectDB();
     try (Statement st = conn.createStatement()) {
         String sql = "SELECT * FROM  healthcaredb.appointmenttable";
             try (ResultSet rs = st.executeQuery(sql)) {
                 appointmentTable.setModel(DbUtils.resultSetToTableModel(rs));
             }
           }
    }
   }
    
        

