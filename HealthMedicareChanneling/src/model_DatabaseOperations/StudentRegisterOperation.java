
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRegisterOperation  extends RegisterOperation{
 
    
    
    @Override
    public   void  RegisterUser(String personalId, String personName, String personalContactNo, String personalEmail, String userName, String personalPassword ){
          try{
            Connection con =  DBConnection.connectDB();
                  Statement  insertStatement = con.createStatement();
                  
                  String insertQuery="INSERT INTO healthcaredb.studenttable(studentId, studentFullName, studentContact, studentEmail, studentUserName, studentPassword) VALUES ('"+personalId+"' ,'"+ personName+"' , '"+personalContactNo +  "' , '" + personalEmail+"' , '"+userName+ "' , '"+personalPassword +"' )";
                  boolean isSucessfull = insertStatement.execute(insertQuery);
                  
                  if(!isSucessfull){System.out.println("Sucessful insertion");}
                  else{System.out.println("inserion failed");}
              
    } 
        catch( SQLException e){ System.out.println("Error in student Registration :"+e);}

}
}