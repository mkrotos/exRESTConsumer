package com.krotos;

import com.krotos.Objects.Student;
import com.krotos.Objects.StudentWithoutId;
import com.krotos.Services.Get;
import com.krotos.Services.Post;

public class Application {

    public static void main(String[] args) {

        Get.example();
        Get.getStudentById(10001);
        Get.getAllStudents();
        Get.getAllStudents2();


        Student student=new Student(5l,"Konrad","asd12863");
        Student student2=new Student(50l,"Pawel","00000");
        Post.addStudent(student);
        Post.addStudent2(student2);

        StudentWithoutId studentWithoutId=new StudentWithoutId("BezID","1111");
        Post.addStudentWithoutId(studentWithoutId);
    }
}
