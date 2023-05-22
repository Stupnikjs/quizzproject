package com.stupnikjs.quizzspring.repository;


import com.stupnikjs.quizzspring.model.Question;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class QuestionRepoImpl implements QuestionRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public Question findByQuestionId(Long question_id) {
        return entityManager.find(Question.class, question_id) ;
    }



    @Transactional
    public void deleteById(Long question_id){
       Question question =  entityManager.find(Question.class, question_id);
       entityManager.remove(question);
       // entityManager.flush();
    }
    @Transactional
    public void save(Question question){
        entityManager.persist(question);
    }


    public List<Question> findAll(){
        String jplq = "SELECT q FROM Question AS q";
        TypedQuery<Question> query = entityManager.createQuery(jplq, Question.class);
        return query.getResultList();
    }

    public List<String> findAllSubject(){
        String jplq = "SELECT q.subject FROM Question AS q";
        TypedQuery<String> query = entityManager.createQuery(jplq, String.class);
        return query.getResultList();
    }

    /*
    @Transactional
    public void incrementAttemptAndDifficulty(Attempt attempt){
        String jpql = "UPDATE Quizz q  " +
                "SET q.difficulty = (SELECT AVG(a.percent_success) FROM Attempt a WHERE a.quizzId = q.quizzId), " +
                "q.attempt = (SELECT COUNT(a) FROM Attempt a WHERE a.quizzId = q.quizzId) " +
                "WHERE q.quizzId = :quizzId";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("quizzId", attempt.getQuizzId());
        query.executeUpdate();
    }
*/

    @Transactional
    public List<Question> findBySubject(String subject) {
        String jplq = "SELECT q FROM Question AS q WHERE subject = :subject";
        TypedQuery<Question> query = entityManager.createQuery(jplq, Question.class);
        query.setParameter("subject", subject);
        return query.getResultList();
    }
}
