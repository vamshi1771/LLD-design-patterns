package org.example.AdapterPattern;

import java.util.List;

public class Demo {

    public static void main(String[] arg){
        StudentClient studentClient = new StudentClient();
       List<Student>  list = studentClient.getStudentsList();
        System.out.println(list);
    }
}
