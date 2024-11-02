package org.example;
import org.example.Email.Email;
public class Main {
    public static void main(String[] args) {
       Email email_details = new Email("bharath","developement","IBM");
       System.out.println(email_details.getCompany_name());
       String email= email_details.generateEmail(email_details.getName(), email_details.getDepartment(), email_details.getCompany_name());
       System.out.println(email);
      String value= email_details.generatePassword();
      email_details.printdetails();
    }
}