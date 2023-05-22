package com.stupnikjs.quizzspring.controller;

import com.stupnikjs.quizzspring.model.Attempt;
import com.stupnikjs.quizzspring.service.AttemptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://misty-darkness-123.fly.dev/")
public class AttemptController {
    @Autowired
    AttemptServiceImpl service;

    @GetMapping("/attempt/all")
    public List<Attempt> getAllAttempt() {
       return service.getAllAttempt();
    }

    @PostMapping("/attempt/new")
    public void saveAttempt(@RequestBody Attempt attempt){
        service.saveAttempt(attempt);

    }

}
