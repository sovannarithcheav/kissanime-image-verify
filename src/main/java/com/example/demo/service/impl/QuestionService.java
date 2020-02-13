package com.example.demo.service.impl;

import com.example.demo.model.Question;
import com.example.demo.model.enun.AnswerEnum;
import com.example.demo.service.IQuestionService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;

@Service
public class QuestionService implements IQuestionService {

    @Override
    public Question generateQuestion() {
        Question q = new Question();
        q.setQuestion(AnswerEnum.C.getForr());
        HashMap<String, String> ansList = new HashMap<>();
        ansList.put(AnswerEnum.C.getForr(), AnswerEnum.C.getPath());
        ansList.put(AnswerEnum.D.getForr(), AnswerEnum.D.getPath());
        ansList.put(AnswerEnum.G.getForr(), AnswerEnum.G.getPath());
        q.setAnsList(ansList);
        q.setArrAns(ansList.values().toArray(String[]::new));
        q.setUUID(UUID.randomUUID().toString());
        return q;
    }

    @Override
    public Object verifyQuestion() {
        return null;
    }
}
