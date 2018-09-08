package com.krotos;

import com.krotos.Objects.Student;
import com.krotos.Services.Get;
import com.krotos.Services.Post;

public class Application {

    public static void main(String[] args) {

        Get.example();
        Get.getStudentById(10001);
        Get.getAllStudents();
        Get.getAllStudents2();

        Student student=new Student(12,"Konrad","asd12863");
        Post.addStudent(student);
    }
}
