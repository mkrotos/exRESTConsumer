package com.krotos;

import com.krotos.Objects.Student;
import com.krotos.Objects.StudentWithoutId;
import com.krotos.Services.Get;
import com.krotos.Services.Post;
import com.krotos.Services.Put;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        Get.example();
        Get.getStudentById(10001);
        Get.getStudentWithoutIdById(10002);
        Get.getAllStudents();
        Get.getAllStudents2();

        log.info("---------------------------------------------");

        Student student = new Student(5l, "Konrad", "asd12863");
        Student student2 = new Student(50l, "Pawel", "00000");
        Post.addStudent(student);
        Post.addStudent2(student2);

        StudentWithoutId studentWithoutId = new StudentWithoutId("BezID", "1111");
        Post.addStudentWithoutId(studentWithoutId);

        log.info("---------------------------------------------");

        Put.changeStudentWithoutIdById(studentWithoutId,10001);
        Put.changeStudentById(new Student(1l,"Changed","999"));
    }
}
