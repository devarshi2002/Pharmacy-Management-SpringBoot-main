package com.pharmacy.Management.services;

import com.pharmacy.Management.models.Question;
import com.pharmacy.Management.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }
}