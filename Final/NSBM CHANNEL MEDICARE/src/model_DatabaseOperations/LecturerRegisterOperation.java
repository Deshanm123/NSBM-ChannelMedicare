
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LecturerRegisterOperation  extends RegisterOperation{

    @Override
    public  void  RegisterUser(String personalId, String personName, String personalContactNo, String personalEmail, String userName, String personalPassword ){
          try{
              Connection con =  DBConnection.connectDB();
                  Statement  insertStatement = con.createStatement();
                  
                  String insertQuery="INSERT INTO healthcaredb.lecturertable(lec_Id, lec_FullName, lec_Contact, lec_Email, userName, userPassword) VALUES ('"+personalId+"' ,'"+ personName+"' , '"+personalContactNo +  "' , '" + personalEmail+"' , '"+userName+ "' , '"+personalPassword +"' )";
                  boolean isSucessfull = insertStatement.execute(insertQuery);
                  
                  if(!isSucessfull){System.out.println("Sucessful insertion");}
                  else{System.out.println("inserion failed");}
              
    } 
        catch(SQLException e){ System.out.println("Error in lecturer Account :"+e);}
}
    }
