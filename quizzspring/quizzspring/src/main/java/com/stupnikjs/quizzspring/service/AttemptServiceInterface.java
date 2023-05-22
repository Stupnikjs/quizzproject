package com.stupnikjs.quizzspring.service;

import com.stupnikjs.quizzspring.model.Attempt;

import java.util.List;

public interface AttemptServiceInterface {
    public List<Attempt> getAllAttempt();
    public void saveAttempt(Attempt attempt);
}
