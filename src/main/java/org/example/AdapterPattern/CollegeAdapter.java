package org.example.AdapterPattern;

public class CollegeAdapter implements Student {

    private CollegeStudents collegeStudents;

    CollegeAdapter(CollegeStudents student){
        this.collegeStudents = student;
    }



    @Override
    public String getName() {
        return this.collegeStudents.getFirstName();
    }

    @Override
    public String getSurName() {
        return this.collegeStudents.getLastName();
    }

    @Override
    public String getEmail() {
        return this.collegeStudents.getEmailAddress();
    }
}
