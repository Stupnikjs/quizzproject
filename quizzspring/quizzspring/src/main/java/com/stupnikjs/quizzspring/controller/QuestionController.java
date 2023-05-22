package com.stupnikjs.quizzspring.controller;


import com.stupnikjs.quizzspring.model.Question;

import com.stupnikjs.quizzspring.model.ResponseArray;
import com.stupnikjs.quizzspring.service.QuestionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class QuestionController {

    @Autowired
    QuestionServiceImpl service;

    @GetMapping("/question/all")
    public List<Question> getAll(){
        return service.getAllQuestions();
    }

    @GetMapping("/subject/all")
    public HashSet<String> getAllSubject(){
        return new HashSet<>(service.getAllSubject());
    }


    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable Long id){
        return service.getQuestionById(id);
    }



    @PostMapping("/question/new")
    public void createNew(@RequestBody Question question) {
        service.saveQuestion(question);
    }


    @PostMapping("/question/bysubject")
    public List<Question> getQuestionBySubjects(@RequestBody ResponseArray responseArray){
        List<Question> returnList = new ArrayList<>();

        for (int i = 0 ; i < responseArray.subjects.size(); i++ ){
            List<Question> list = service.getQuestionBySubject(responseArray.subjects.get(i));
            returnList.addAll(list);
        }
        return returnList;
    }

    @DeleteMapping("/question/delete/{id}")
    public void deleteHandler(@PathVariable Long id){
        service.deleteQuestion(id);
    }



}
