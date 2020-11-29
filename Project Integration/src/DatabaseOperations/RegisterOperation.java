
package DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class RegisterOperation {
    public static String  url="jdbc:mysql://localhost:3306/healthcaredb";
    public static String user="root";
    public static  String  dbPassword = "1163078"; 
    
    public void RegisterUser(String personalId, String personName, String personalContactNo, String personalEmail, String userName, String personalPassword ){
    }
    
    //inside dashboards
     public void insertAppoinment( String FullName,String patientType,String AppointmentDate, String AppointmentTime){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection(url,user,dbPassword); 
            String insertQuery= "INSERT INTO healthcaredb.appointmenttable( patientName, patientType, appointmentDate, appointmentTime, channellingStatus) VALUES ('"+ FullName +"', '"+  patientType + "','"+ AppointmentDate +"','"+ AppointmentTime +"','unchecked');";
             PreparedStatement st = conn.prepareStatement(insertQuery);
             st.execute();
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger("Classnotfound in InsertAppoinment  in student/lecturer"+ex);
        }
        catch (SQLException ex) {
            Logger.getLogger("SQLException in InsertAppoinment  in student/lecturer"+ex);
        }
    }      
}
