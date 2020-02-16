package com.example.demo.service;

import com.example.demo.model.Question;
import com.example.demo.model.ReqObject;

public interface IQuestionService {


    public Object generateQuestion();

    public Question verifyQuestion(ReqObject req);

}
