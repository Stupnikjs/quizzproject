package com.stupnikjs.quizzspring.service;

import com.stupnikjs.quizzspring.model.Attempt;
import com.stupnikjs.quizzspring.repository.AttemptRepository;
import com.stupnikjs.quizzspring.repository.QuestionRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttemptServiceImpl implements AttemptServiceInterface{

    @Autowired
    private AttemptRepository attemptRepository;

    @Autowired
    private QuestionRepoImpl quizzRepo;

    @Override
    public List<Attempt> getAllAttempt() {
        return attemptRepository.findAll();
    }

    @Override
    public void saveAttempt(Attempt attempt) {
        Attempt attemptSaved = attemptRepository.save(attempt);
        // if (attemptSaved != null) quizzRepo.incrementAttemptAndDifficulty(attempt);

    }
}
