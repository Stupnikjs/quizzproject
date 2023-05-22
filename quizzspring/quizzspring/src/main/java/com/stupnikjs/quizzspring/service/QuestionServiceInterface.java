package com.stupnikjs.quizzspring.service;



import com.stupnikjs.quizzspring.model.Attempt;
import com.stupnikjs.quizzspring.model.Question;

import java.util.List;

public interface QuestionServiceInterface  {

   public Question getQuestionById(Long id);
   public List<Question> getAllQuestions();
   public void saveQuestion(Question question);
   public void deleteQuestion(Long id);

   public List<Question> getQuestionBySubject(String subject) ;
   public List<String> getAllSubject();

   void saveAttempt(Attempt attempt);
}
