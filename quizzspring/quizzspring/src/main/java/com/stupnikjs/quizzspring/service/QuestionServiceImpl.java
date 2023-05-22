package com.stupnikjs.quizzspring.service;


import com.stupnikjs.quizzspring.model.Attempt;
import com.stupnikjs.quizzspring.model.Question;
import com.stupnikjs.quizzspring.repository.AttemptRepository;
import com.stupnikjs.quizzspring.repository.QuestionRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionServiceInterface {

    @Autowired
    QuestionRepoImpl questionRepository;

    @Autowired
    AttemptRepository attemptRepository;


    @Override
    public void deleteQuestion(Long id) {

    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return questionRepository.findByQuestionId(id);
    }

    @Override
    public List<Question> getQuestionBySubject(String subject) {
        return questionRepository.findBySubject(subject);
    }

    @Override
    public List<String> getAllSubject() {
        return questionRepository.findAllSubject();
    }

    @Override
    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void saveAttempt(Attempt attempt){
        attemptRepository.save(attempt);
    }



}
