package com.example.demo.model;

import com.example.demo.model.response.AnsRes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.lang.invoke.CallSite;
import java.util.HashMap;
import java.util.List;

@Data
@JsonIgnoreProperties({"ans_uuid"})
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Question {

    private String question;
    private List<AnsRes> arrAns;
    /**
     * at first initial first element according to field :
     *
     * @see #question
     * so we still have two slots for another random answer !
     */
    private String ansUUID;
    private String UUID;
    private String status;
}


/**
 * + Question Statement
 * + & Three Answers in Picture
 * + UUID for ref_answer
 * &
 */