
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
     static final String dbURL= "jdbc:mysql://localhost/healthcaredb";
    static final String userName = "root";
    static final String userPassword = "";
    
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL,userName,userPassword);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors while connecting to db.");
            return null;
        }
    }
}
