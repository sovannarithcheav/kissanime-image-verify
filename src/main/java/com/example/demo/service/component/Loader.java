package com.example.demo.service.component;

import com.example.demo.model.constant.AnswerMap;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class Loader {


    @PostConstruct
    public void init(){
        AnswerMap.map = new HashMap<>();
    }

}
