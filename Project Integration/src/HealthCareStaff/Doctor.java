
package HealthCareStaff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Doctor extends HealthCareStaff {
    private String  DoctorId;
    
    //this is unique to doctor //not get inherited
    public   static void updateRecord(String channellingStatus,int appointmentNo){
       try{
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root","1163078")) {
               Statement updateStatement = con.createStatement();
               //updatestatements
               String updateQuery = "update healthcaredb.appointmenttable  set channellingStatus ='"+ channellingStatus +"' where appointmentNo = '"+ appointmentNo +"'";
               boolean isUpdated = updateStatement.execute(updateQuery);
               //check update
               if(!isUpdated){ System.out.println("Data update sucessfull");}
               else{System.out.println("update failed");}
           }
    } 
        catch(ClassNotFoundException | SQLException e){ System.out.println("Exception in Doctor : " +e);}
    }
}
