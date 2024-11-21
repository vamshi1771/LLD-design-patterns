package org.example.AdapterPattern;

public class SchoolStudents implements  Student{
    private String Name;
    private String surName;
    private String email;
    SchoolStudents(String name, String surName, String email){
        this.email = email;
        this.Name= name;
        this.surName = surName;
    }
    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getSurName() {
        return this.surName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
