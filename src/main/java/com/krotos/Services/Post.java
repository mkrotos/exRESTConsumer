package com.krotos.Services;

import com.krotos.Application;
import com.krotos.Objects.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

public class Post {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String myURL = "http://localhost:8080/students";

    public static void addStudent(Student student){
        HttpEntity<Student> request=new HttpEntity<>(student);
        Student studentAnswer=restTemplate.postForObject(myURL,request,Student.class);
    }
}
