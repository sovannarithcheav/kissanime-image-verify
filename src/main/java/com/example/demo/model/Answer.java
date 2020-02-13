package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String ans;
    private String status;

}
