
package model_DatabaseOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  DBConnection {
     static final String URL= "jdbc:mysql://localhost/healthcaredb";
    static final String U_NAME = "root";
    static final String U_PASS = "";
    
    
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,U_NAME,U_PASS);
            return conn;
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("There were errors while connecting to db ." +ex);
            return null;
        }
    }
}
