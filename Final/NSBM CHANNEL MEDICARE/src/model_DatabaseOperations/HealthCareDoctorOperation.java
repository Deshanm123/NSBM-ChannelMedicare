
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class HealthCareDoctorOperation extends HealthCareOperation{

    public   static void updateRecord(String channellingStatus,int appointmentNo) throws SQLException{
       try{
     
           Connection con =DBConnection.connectDB();
               Statement updateStatement = con.createStatement();
               //updatestatements
               String updateQuery = "update healthcaredb.appointmenttable  set channellingStatus ='"+ channellingStatus +"' where appointmentNo = '"+ appointmentNo+"'";
               boolean isUpdated = updateStatement.execute(updateQuery);
               //check update
               if(!isUpdated){ System.out.println("Data update sucessfull");}
               else{System.out.println("update failed");}
           
    } 
        catch(SQLException e){ System.out.println(e);}
    }
    
    
}
