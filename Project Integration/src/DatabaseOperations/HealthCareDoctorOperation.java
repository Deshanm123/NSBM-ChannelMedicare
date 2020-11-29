
package DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class HealthCareDoctorOperation extends HealthCareOperation{

    
    
    public   static void updateRecord(String channellingStatus,int appointmentNo) throws SQLException{
       try{
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection(url,user,password)) {
               Statement updateStatement = con.createStatement();
               //updatestatements
               String updateQuery = "update healthcaredb.appointmenttable  set channellingStatus ='"+ channellingStatus +"' where appointmentNo = '"+ appointmentNo+"'";
               boolean isUpdated = updateStatement.execute(updateQuery);
               //check update
               if(!isUpdated){ System.out.println("Data update sucessfull");}
               else{System.out.println("update failed");}
           }
    } 
        catch(ClassNotFoundException e){ System.out.println(e);}
    }
    
    
}
