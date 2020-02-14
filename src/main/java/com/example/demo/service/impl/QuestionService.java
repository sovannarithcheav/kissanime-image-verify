package com.example.demo.service.impl;

import com.example.demo.model.Question;
import com.example.demo.model.enun.AnswerEnum;
import com.example.demo.service.IQuestionService;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

@Service
public class QuestionService implements IQuestionService {

    @Override
    public Question generateQuestion() {
        Question q = new Question();
        HashMap<Integer, String> ansList = new HashMap<>();
        HashMap<Integer, AnswerEnum> ll = new HashMap<>();
        List<Integer> dup = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int ii = getRandomNo();
            if (!dup.isEmpty() && dup.contains(ii)) {
                i --; continue;
            }
            dup.add(ii);
            AnswerEnum answerEnum = AnswerEnum.answerMap.get(ii);
            ll.put(i, answerEnum);
            ansList.put(i, UUID.randomUUID().toString() + "@" + answerEnum.getPath());
        }
        AnswerEnum answerEnum = ll.get(getRandomNo(0, 2));
        // Set Question
        q.setQuestion(answerEnum.get$for());

        q.setAnsList(ansList);

        q.setArrAns(ansList.values().toArray(String[]::new));
        q.setUUID(UUID.randomUUID().toString());

        return q;
    }

    @Override
    public Object verifyQuestion() {
        return null;
    }


    private int getRandomNo(int low, int high) {
        Random r = new Random();
        int result = r.nextInt(high - low) + low;
        return result;
    }

    private int getRandomNo() {
        return getRandomNo(1, 8);
    }
}
