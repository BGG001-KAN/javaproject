package org.example.Email;

import java.security.PrivateKey;
import java.util.UUID;

public class Email {
    private  String name;
    private  String department;
    private  String company_name;
    private  String password;

public Email(String name,String department,String company_name){
   this.company_name= company_name;
   this.name=name;
   this.department=department;
   this.password=generatePassword();
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String generateEmail(String name,String department,String company_name){
     this.company_name=company_name;
     this.name=name;
     this.department=department;
      return name+department+"@"+company_name+".com";}

    public String generatePassword(){
      String random = UUID.randomUUID().toString();
      return random;
    }
   public void printdetails(){
    System.out.println(getCompany_name());
    System.out.println(getPassword());
    System.out.println(getCompany_name());
    System.out.println(getName());
   }

}
