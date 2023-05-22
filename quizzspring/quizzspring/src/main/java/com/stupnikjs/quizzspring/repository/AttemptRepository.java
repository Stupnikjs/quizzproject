package com.stupnikjs.quizzspring.repository;

import com.stupnikjs.quizzspring.model.Attempt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttemptRepository extends JpaRepository<Attempt, Long> {

}
