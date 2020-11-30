
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public  class RegisterOperation {
   
    
    public void RegisterUser(String personalId, String personName, String personalContactNo, String personalEmail, String userName, String personalPassword ){
    }
    
    //inside dashboards
     public void insertAppoinment( String FullName,String patientType,String AppointmentDate, String AppointmentTime){
        try {
           
            Connection conn =  DBConnection.connectDB();
            String insertQuery= "INSERT INTO healthcaredb.appointmenttable( patientName, patientType, appointmentDate, appointmentTime, channellingStatus) "
                    + "VALUES ('"+ FullName +"', '"+  patientType + "','"+ AppointmentDate +"','"+ AppointmentTime +"','unchecked');";
             PreparedStatement st = conn.prepareStatement(insertQuery);
             st.execute();
        }
        catch (SQLException ex) {
            Logger.getLogger("SQLException in InsertAppoinment  in student/lecturer"+ex);
        }
    }      
}
