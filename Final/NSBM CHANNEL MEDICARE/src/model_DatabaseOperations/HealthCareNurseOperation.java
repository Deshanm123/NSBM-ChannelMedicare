package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class HealthCareNurseOperation  extends HealthCareOperation implements InsertOperationInterface{
    public  static void  insertRecord(String patientName,String patientType,String appointmentDate, String appointmentTime) throws ClassNotFoundException, SQLException{
          try{
                Connection con =  DBConnection.connectDB();
                  Statement  insertStatement = con.createStatement();
                  
                  String insertQuery="INSERT INTO healthcaredb.appointmenttable(patientName,patientType,appointmentDate,appointmentTime,channellingStatus) VALUES ('"+ patientName+"' , '"+ patientType+  "' , '" +  appointmentDate +"' , '"+ appointmentTime + "' , ' unchecked')";
                  boolean isSucessfull = insertStatement.execute(insertQuery);
                  if(!isSucessfull){
                      System.out.println("Sucessful insertion");
                  }
                  else{
                      System.out.println("inserion failed");
                  }
    } 
        catch(SQLException ex){System.out.println(ex);}
}

    public static void deleteRecordByAppointmentNo(int appointmentNo){
       try{
        Connection con =  DBConnection.connectDB();
        Statement  deleteStatement = con.createStatement();
               
               String deleteQuery  = "delete from healthcaredb.appointmenttable where appointmentNo  = '"+ appointmentNo +"' ";
               boolean isDeleted = deleteStatement.execute(deleteQuery);
               
               if(!isDeleted){
                   System.out.println("record deleted Sucessfully");
               }else{
                   System.out.println("Record Deletion failed");
           }
    } 
        catch(SQLException e){
            System.out.println(e);
        }
     }
//interface method
    @Override
    public void insertAppoinment(String patientName, String patientType, String appointmentDate, String appointmentTime) {
    try{
      
               Connection con =  DBConnection.connectDB();
                  Statement  insertStatement = con.createStatement();
                  
                  String insertQuery="INSERT INTO healthcaredb.appointmenttable(patientName,patientType,appointmentDate,appointmentTime,channellingStatus)"
                          + " VALUES ('"+ patientName+"' , '"+ patientType+  "' , '" +  appointmentDate +"' , '"+ appointmentTime + "' , ' unchecked')";
                  boolean isSucessfull = insertStatement.execute(insertQuery);
                  
                  if(!isSucessfull)
                  {
                      System.out.println("Sucessful insertion");
                  }
                  else{
                      System.out.println("inserion failed");
                  }
              
    } 
        catch(SQLException ex){
            System.out.println(ex);
        }
    } 
            
    
    
}
