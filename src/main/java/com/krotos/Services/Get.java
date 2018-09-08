package com.krotos.Services;

import com.krotos.Application;
import com.krotos.Objects.Quote;
import com.krotos.Objects.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;


public class Get {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String myURL = "http://localhost:8080/students";

    public static void example() {
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        //or:
        System.out.println(quote.toString());
    }

    public static void getStudentById(long id) {
        Student student = restTemplate.getForObject(myURL+"/"+id, Student.class);
        log.info(student.toString());
    }

    public static void getAllStudents() {
        ResponseEntity<List<Student>> response = restTemplate.exchange(
                myURL,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>() {
                }
        );
        List<Student> students = response.getBody();
        log.info(students.toString());
    }

    public static void getAllStudents2() {
        ResponseEntity<Student[]> response = restTemplate.getForEntity(myURL, Student[].class);
        log.info(Arrays.toString(response.getBody()));
    }
}
