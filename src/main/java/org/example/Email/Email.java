package org.example.Email;

import java.util.UUID;

public class Email {
    private  String name;
    private  String department;
    private  String companyName;
    private  String password;

public Email(String name,String department,String companyName){
   this.companyName= companyName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String generateEmail(){
     this.companyName=companyName;
     this.name=name;
     this.department=department;
      return name+department+"@"+companyName+".com";}

    public String generatePassword(){
      String random = UUID.randomUUID().toString();
      return random;
    }
   public void printdetails(){
    System.out.println("********** welcome to "+ getCompanyName()+" "+"Please find the your email id and details below *******");
    System.out.println("company name is "+ getCompanyName());
    System.out.println("Email id "+ generateEmail());
    System.out.println("password is "+getPassword());
    System.out.println("department name is "+getDepartment());
    System.out.println("name is " +getName());
    System.out.println("Please help to rest the password with help of setpassword");
   }

}
