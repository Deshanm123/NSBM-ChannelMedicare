package controller_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Account {
    protected String fullName;
    protected String contact;
     protected  String email;
    protected  String password;
     protected String userName;

public Account(){    
    fullName= " ";
    contact =" ";
    email=" ";
    userName =" ";
    password = " ";
}

public Account( String afullName, String aContact,String aEmail,String aUserName,String aPassword){
    this.fullName = afullName;
    this.contact = aContact;
    this.email=aEmail;
    this.userName= aUserName;
    this.password = aPassword;
}

   public String getFullName(){
        return fullName;
    }
    public void setFullName(String aFullName) {
        this.fullName = aFullName;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String aContact) {
        this.contact = aContact;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String aEmail) {
        this.email = aEmail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String aPassword) {
        this.password = aPassword;
    }   
    public String getUserName() {
        return userName;
    }
    public void setUserName(String aUserName) {
        this.userName = aUserName;
    }
    //abstract method
}