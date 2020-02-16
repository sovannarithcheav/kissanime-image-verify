package com.example.demo.controller;

import com.example.demo.model.Question;
import com.example.demo.model.ReqObject;
import com.example.demo.service.impl.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/generate")
    public ResponseEntity<Object> generateQuestion() {
        Question q = questionService.generateQuestion();
        return ResponseEntity.ok(q);
    }

    @PostMapping("/verify")
    public ResponseEntity<Object> verifyQuestion(@RequestBody ReqObject req) {
        Question q = questionService.verifyQuestion(req);
        return ResponseEntity.ok(q);
    }
}
