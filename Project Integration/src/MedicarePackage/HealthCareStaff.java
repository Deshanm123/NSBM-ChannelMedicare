
package MedicarePackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class HealthCareStaff {
   private String name;
   private  int contactNo;
   private String userName;
   private String password;

   //default constructor
   public HealthCareStaff(){
    name  = " ";
    contactNo= 077000000;
    userName=  " ";
    password= " ";
   }
   
   //parametrized constructor
    public HealthCareStaff(String name,int contactNo,String userName,String password){
    this.name  = name;
    this.contactNo=  contactNo ;
    this. userName=  " ";
     this.password= " ";
   }
  
    //setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public void showTableData() {
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcaredb", "root","1163078");
            
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM healthcaredb.appointmenttable";
            ResultSet rs = st.executeQuery(sql);
           // jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       
}
catch(ClassNotFoundException e){
    System.out.println("Class not found exception in health Staff file :=>"+e);
}
catch(SQLException e){
    System.out.println("Sql exception in Healh care staff = >"+e);
}
    }
    
    
}
