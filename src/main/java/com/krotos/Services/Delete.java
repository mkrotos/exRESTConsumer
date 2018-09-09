package com.krotos.Services;

import com.krotos.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

public class Delete {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final String myURL = "http://localhost:8080/students";

    public static void deleteById(long id){
        try {
            restTemplate.delete(myURL+"/"+id);
        }catch (HttpServerErrorException e){
            e.printStackTrace();
            log.error("There was nothing to delete --------------");
        }
    }
}
