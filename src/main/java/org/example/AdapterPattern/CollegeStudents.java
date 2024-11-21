package org.example.AdapterPattern;

import lombok.Data;

@Data
public class CollegeStudents {
    private String  firstName;
    private  String lastName;
    private  String emailAddress;
     CollegeStudents(String name, String lastName, String email){
         this.emailAddress = email;
         this.firstName = name;
         this.lastName = lastName;
     }

}
