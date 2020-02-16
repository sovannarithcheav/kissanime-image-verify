package com.example.demo.service.impl;

import com.example.demo.model.Question;
import com.example.demo.model.ReqObject;
import com.example.demo.model.constant.AnswerMap;
import com.example.demo.model.enun.AnswerEnum;
import com.example.demo.model.response.AnsRes;
import com.example.demo.service.IQuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionService implements IQuestionService {

    @Override
    public Question generateQuestion() {
        Question q = new Question();
        List<AnsRes> ansList = new ArrayList<>();
        HashMap<Integer, AnswerEnum> ll = new HashMap<>();
        HashMap<Integer, String> kk = new HashMap<>();
        List<Integer> dup = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int ii = getRandomNo();
            String uuid = UUID.randomUUID().toString();
            AnsRes ansRes = new AnsRes();
            if (!dup.isEmpty() && dup.contains(ii)) {
                i--;
                continue;
            }
            dup.add(ii);
            AnswerEnum answerEnum = AnswerEnum.answerMap.get(ii);
            ll.put(i, answerEnum);
            kk.put(i, uuid);
            ansRes.setPath(answerEnum.getPath());
            ansRes.setUuid(uuid);
            ansList.add(ansRes);
        }
        int ans = getRandomNo(0, 2);
        AnswerEnum answerEnum = ll.get(ans);
        // Set Question
        q.setQuestion(answerEnum.get$for());
        q.setAnsUUID(kk.get(ans));

        q.setArrAns(ansList);
        q.setUUID(UUID.randomUUID().toString());
        AnswerMap.map.put(q.getUUID(), q);
        return q;
    }

    @Override
    public Question verifyQuestion(ReqObject req) {
        return verifyQuestion(req.getUuid(), req.getAnsUuid());
    }

    public Question verifyQuestion(String uuid, String ansUuid) {
        Question q = AnswerMap.map.get(uuid);
        if (q != null && q.getAnsUUID().equals(ansUuid))
            return q;
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
