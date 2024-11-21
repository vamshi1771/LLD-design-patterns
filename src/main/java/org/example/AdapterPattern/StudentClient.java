package org.example.AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {


    public  List<Student> getStudentsList() {

        List<Student> studentList = new ArrayList<>();

        CollegeStudents collegeStudents = new CollegeStudents("vadlvj", "adhbva", "cadca");
        SchoolStudents schoolStudents = new SchoolStudents("a", "davc", "avkhb");

        // studentList.add(collegeStudents); // since collegeStudents class not compatible with Student Interface, we create a adapter interface which implements Students and try to match with legacy code (CollegeStudents)

        // After Creating a Adapter class to make compatible with legacy code (collegeStudent class)
        studentList.add(new CollegeAdapter(collegeStudents));

        studentList.add(schoolStudents);


        return studentList;
    }

}
