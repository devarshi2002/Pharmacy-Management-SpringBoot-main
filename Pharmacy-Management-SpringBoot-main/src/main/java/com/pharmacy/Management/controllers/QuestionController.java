package com.pharmacy.Management.controllers;

import com.pharmacy.Management.models.Question;
import com.pharmacy.Management.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/ask")
    public String submitQuestion(@RequestParam("name") String name,
                                 @RequestParam("email") String email,
                                 @RequestParam("question") String questionText) {
        
        Question question = new Question(name, email, questionText);
        questionService.saveQuestion(question);
        
        return "redirect:/expert?success=QuestionSubmitted";
    }
}