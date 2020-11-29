
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LecturerRegisterOperation  extends RegisterOperation{

    @Override
    public  void  RegisterUser(String personalId, String personName, String personalContactNo, String personalEmail, String userName, String personalPassword ){
          try{
        Class.forName("com.mysql.jdbc.Driver");
              try (Connection con = DriverManager.getConnection(url,user,dbPassword)) {
                  Statement  insertStatement = con.createStatement();
                  
                  String insertQuery="INSERT INTO healthcaredb.lecturertable(lec_Id, lec_FullName, lec_Contact, lec_Email, userName, userPassword) VALUES ('"+personalId+"' ,'"+ personName+"' , '"+personalContactNo +  "' , '" + personalEmail+"' , '"+userName+ "' , '"+personalPassword +"' )";
                  boolean isSucessfull = insertStatement.execute(insertQuery);
                  
                  if(!isSucessfull){System.out.println("Sucessful insertion");}
                  else{System.out.println("inserion failed");}
              }
    } 
        catch(ClassNotFoundException | SQLException e){ System.out.println("Error in lecturer Account :"+e);}
}
    }
