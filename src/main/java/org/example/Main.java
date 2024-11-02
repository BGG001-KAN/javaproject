package org.example;
import org.example.Email.Email;
public class Main {
    public static void main(String[] args) {
       Email email_details = new Email("bharath","developement","IBM");
       String email= email_details.generateEmail();
       String value= email_details.generatePassword();
       email_details.printdetails();
    }
}