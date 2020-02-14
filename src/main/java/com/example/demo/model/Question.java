package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.HashMap;

@Data
@JsonIgnoreProperties("ansList")
public class Question {

    private String question;
    private String[] arrAns;
    /**
     * at first initial first element according to field :
     *
     * @see #question
     * so we still have two slots for another random answer !
     */
    private HashMap<Integer, String> AnsList;
    private String UUID;

}


/**
 * + Question Statement
 * + & Three Answers in Picture
 * + UUID for ref_answer
 * &
 */