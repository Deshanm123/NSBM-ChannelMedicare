package controller_Classes;



public class LecturerAccount  extends Account{
    private  String lecturerId;
    
    public LecturerAccount(){
         super();
        lecturerId = " ";
       
    }
   
    public LecturerAccount(String afullName,String aContact,String aEmail,String aUserName,String aPassword,String aLecturerId){
        super(afullName, aContact,aEmail,aUserName,aPassword);
        lecturerId = aLecturerId;
    }
 
    public String getLecturerId() {
        return lecturerId;
    }
    public void setLecturerId(String aLecturerId) {
        this.lecturerId = lecturerId;
    }
    
}
