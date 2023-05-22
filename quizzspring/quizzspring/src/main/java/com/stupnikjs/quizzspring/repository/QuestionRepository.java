package com.stupnikjs.quizzspring.repository;


import com.stupnikjs.quizzspring.model.Attempt;
import com.stupnikjs.quizzspring.model.Question;


import java.util.List;

public interface QuestionRepository {


      List<Question> findAll();

      Question findByQuestionId(Long question_id);

      List<Question> findBySubject(String subject);

      List<String> findAllSubject();
      // void incrementAttemptAndDifficulty(Attempt attempt);

      void deleteById(Long question_id);
      void save(Question question);


}
