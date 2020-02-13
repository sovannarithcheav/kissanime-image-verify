package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
@Data
public class Answer {

    @Id
    private Integer id;
    private String answer;
    private String status;

}
