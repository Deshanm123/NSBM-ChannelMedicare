package controller_Classes;


import controller_Classes.Account;


public class StudentAccount extends Account{
    private String studentId;  //11characters 
    private String studentYear;
    
    public StudentAccount(){
        super();
        studentId = " ";
        studentYear =  " ";
     
    }
    public StudentAccount(String afullName, String aContact,String aEmail,String aUserName,String aPassword,String aStudentId,String aStudentYear){
        super(afullName, aContact,aEmail,aUserName, aPassword);
        this.studentId= aStudentId;
        this.studentYear = aStudentYear;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String aStudentId) {
        this.studentId= aStudentId;
    }

    public String getStudentYear() {
        return studentYear;
    }
    public void setStudentYear(String aStudentYear) {
        this.studentYear = aStudentYear;
    }
}
