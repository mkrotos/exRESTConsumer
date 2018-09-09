package com.krotos.Services;

import com.krotos.Application;
import com.krotos.Objects.Student;
import com.krotos.Objects.StudentWithoutId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class Put {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String myURL = "http://localhost:8080/students";

    public static void changeStudentWithoutIdById(StudentWithoutId studentWithoutId, long id) {
        restTemplate.put(myURL + "/" + id, studentWithoutId);
    }

    public static void changeStudentById(Student student){
        restTemplate.put(myURL+"/"+student.getId(),student);
    }

    public static void changeStudentById2(Student student){
        HttpEntity<Student> request=new HttpEntity<>(student);
        restTemplate.exchange(myURL+"/"+student.getId(),HttpMethod.PUT,request,Void.class);
    }


}
