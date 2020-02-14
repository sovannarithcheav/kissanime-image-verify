package com.example.demo.service.impl;

import com.example.demo.model.Answer;
import com.example.demo.model.Question;
import com.example.demo.model.enun.AnswerEnum;
import com.example.demo.service.IQuestionService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

@Service
public class QuestionService implements IQuestionService {

    @Override
    public Question generateQuestion() {
        Question q = new Question();
        q.setQuestion(AnswerEnum.C.get$for());
        HashMap<String, String> ansList = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            int ii = getRandomNo();
            AnswerEnum answerEnum = AnswerEnum.answerMap.get(ii);
            ansList.put(answerEnum.getAlpha(), answerEnum.getPath());
        }
        AnswerEnum answerEnum = AnswerEnum.answerMap.get(getRandomNo());
        

        q.setAnsList(ansList);

        q.setArrAns(ansList.values().toArray(String[]::new));
        q.setUUID(UUID.randomUUID().toString());

        return q;
    }

    @Override
    public Object verifyQuestion() {
        return null;
    }


    private int getRandomNo(int low, int high){
        Random r = new Random();
        int result = r.nextInt(high-low) + low;
        return result;
    }

    private int getRandomNo(){
        return getRandomNo(0, 7);
    }
}
