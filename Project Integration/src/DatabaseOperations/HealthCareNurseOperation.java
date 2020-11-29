package DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HealthCareNurseOperation  extends HealthCareOperation{
    
    public  static void  insertRecord(String patientName,String patientType,String appointmentDate, String appointmentTime,String channelingStatus) throws ClassNotFoundException{
          try{
        Class.forName("com.mysql.jdbc.Driver");
              try (Connection con = DriverManager.getConnection(url,user,password)) {
                  Statement  insertStatement = con.createStatement();
                  
                  String insertQuery="INSERT INTO healthcaredb.appointmenttable(patientName,patientType,appointmentDate,appointmentTime,channelingStatus) VALUES ('"+ patientName+"' , '"+ patientType+  "' , '" +  appointmentDate +"' , '"+ appointmentTime + "' , '"+ channelingStatus +"' )";
                  boolean isSucessfull = insertStatement.execute(insertQuery);
                  if(!isSucessfull){System.out.println("Sucessful insertion");}
                  else{System.out.println("inserion failed");}
              }
    } 
        catch(SQLException ex){System.out.println(ex);}
}

    public static void deleteRecordByAppointmentNo(int appointmentNo){
       try{
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection(url,user,password)) {
               Statement  deleteStatement = con.createStatement();
               
               String deleteQuery  = "delete from healthcaredb.appointmenttable where appointmentNo  = '"+ appointmentNo +"' ";
               boolean isDeleted = deleteStatement.execute(deleteQuery);
               
               if(!isDeleted){System.out.println("record deleted Sucessfully");}
               else{System.out.println("Record Deletion failed");
               }     }
    } 
        catch(ClassNotFoundException | SQLException e){System.out.println(e);}
       }
    
}
