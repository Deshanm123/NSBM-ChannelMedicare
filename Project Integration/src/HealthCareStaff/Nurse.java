
package HealthCareStaff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 
public class Nurse extends HealthCareStaff {
    private String nurseId;
    public static String  url="jdbc:mysql://localhost:3306/healthcaredb";
    public static String user="root";
    public static  String  password = "1163078"; 
    
 //get interface 
      public  static void  insertRecord(String patientName,String patientType,String appointmentDate, String appointmentTime,String channelingStatus){
          try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        Statement  insertStatement = con.createStatement();

        String insertQuery="INSERT INTO healthcaredb.appointmenttable(patientName,patientType,appointmentDate,appointmentTime,channelingStatus) VALUES ('"+ patientName+"' , '"+ patientType+  "' , '" +  appointmentDate +"' , '"+ appointmentTime + "' , '"+ channelingStatus +"' )";
        boolean isSucessfull = insertStatement.execute(insertQuery);
        
        if(!isSucessfull){System.out.println("Sucessful insertion");}
        else{System.out.println("inserion failed");}
        con.close();
    } 
        catch(ClassNotFoundException e){ System.out.println(e);}
        catch(SQLException ex){System.out.println(ex);}
}
      
//  delete -> unique
     public static void deleteRecordByAppointmentNo(int appointmentNo){
       try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,password);
        Statement  deleteStatement = con.createStatement();
   
        String deleteQuery  = "delete from healthcaredb.appointmenttable where appointmentNo  = '"+ appointmentNo +"' ";
        boolean isDeleted = deleteStatement.execute(deleteQuery);

        if(isDeleted){System.out.println("record deleted Sucessfully");}
        else{System.out.println("Record Deletion failed");
     }
         con.close();
    } 
        catch(ClassNotFoundException e){System.out.println(e);}
        catch(SQLException ex){System.out.println(ex); }
       }
      
}
