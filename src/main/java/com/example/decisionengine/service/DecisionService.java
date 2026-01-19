package com.example.decisionengine.service;

import org.springframework.stereotype.Service;

@Service
public class DecisionService {

    public String makeDecision(String input) {
        // Implement AI decision logic here
        return "decision-made-for-" + input;
    }

}