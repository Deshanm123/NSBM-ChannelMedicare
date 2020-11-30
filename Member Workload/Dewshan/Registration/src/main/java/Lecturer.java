/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruveendra
 */
public class Lecturer extends Account {
    String employeeId;
    String division;
    
    public Lecturer(){
        
    }
    
    public Lecturer(String employeeId, String division, String fullName,String address, String contact, String email,String password, String username ){
        super( fullName,  address,  contact,  email, password, username);
        this.employeeId=employeeId;
        this.division=division;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    
    
}
