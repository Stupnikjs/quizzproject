package com.stupnikjs.quizzspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long questionId;


    @Column
    @JsonProperty("subject")
    String subject;


    public Question(){

    }

    @Column
    @JsonProperty("difficulty")
    int difficulty;

    @Column
    int attempt;

    @Column()
    @JsonProperty("entitled")
    private String entitled;

    @Column
    @JsonProperty("second")
    private int second;

    @Embedded
    @JsonProperty("items")
    private Items items;


    @Column()
    @JsonProperty("answer")
    private char answer;


}
