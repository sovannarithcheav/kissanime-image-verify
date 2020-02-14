package com.example.demo;

import com.example.demo.model.enun.AnswerEnum;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    private static ObjectMapper createObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        // enable toString method of enums to return the value to be mapped
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        return mapper;
    }

    public static void main(String[] args) {
        System.out.println("====================================================" + AnswerEnum.C.toString());
        SpringApplication.run(DemoApplication.class, args);
    }

}
