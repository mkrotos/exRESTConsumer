package com.krotos.Services;

import com.krotos.Application;
import com.krotos.Objects.Quote;
import com.krotos.Objects.Student;
import com.krotos.Objects.StudentsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Get {

    private static final Logger log=LoggerFactory.getLogger(Application.class);
    private static final RestTemplate restTemplate= new RestTemplate();

    public static void example() {
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        //or:
        System.out.println(quote.toString());
    }

    public static void getStudentById(long id){
        URL url;
        Student student;
        try {
            url=new URL("http","localhost",8080,"students/"+id);
            student=restTemplate.getForObject(url.toString(),Student.class);
            log.info(student.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void getAllStudents(){
        StudentsList studentList;
        studentList=restTemplate.getForObject("http://localhost:8080/students",StudentsList.class);
        log.info(studentList.toString());
    }

    public static void getAllStudents2(){
        ResponseEntity<List<Student>> response=restTemplate.exchange(
                "http://localhost:8080/students",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>() {}
        );
        List<Student> students=response.getBody();
        log.info(students.toString());
    }
}
