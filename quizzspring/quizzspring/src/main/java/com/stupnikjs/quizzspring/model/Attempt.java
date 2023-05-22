package com.stupnikjs.quizzspring.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity
public class Attempt {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attemptId;


    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    @JsonProperty("question_id")
    private Long questionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="questionId", referencedColumnName = "questionId", insertable=false, updatable=false)
    private Question question;


    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private Date created_at;

    @JsonProperty("percent_success")
    private int percent_success;


    public Attempt(){

    }

}
