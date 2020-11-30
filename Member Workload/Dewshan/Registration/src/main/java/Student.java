/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruveendra
 */
public class Student extends Account {
    String studentId;
    String degree;
    String year;
    String batch;
    
    
    public Student (){
        
    }
    
    public Student (String studentId, String degree, String year, String batch, String fullName, String address, String contact, String email,String password, String username){
        
        super(fullName,address,contact,email,password,username);
        this.studentId=studentId;
        this.degree=degree;
        this.year=year;
        this.batch=batch;
        
        
    }

    public String getStudenId() {
        return studentId;
    }

    public void setStudenId(String studenId) {
        this.studentId = studenId;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String Degree) {
        this.degree = Degree;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    
    
    
}
