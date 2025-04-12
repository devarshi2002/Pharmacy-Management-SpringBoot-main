package com.pharmacy.Management.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String questionText;

    @Column(nullable = false)
    private LocalDateTime askedAt;

    public Question() {
        this.askedAt = LocalDateTime.now();
    }

    public Question(String name, String email, String questionText) {
        this.name = name;
        this.email = email;
        this.questionText = questionText;
        this.askedAt = LocalDateTime.now();
    }

    // Getters and Setters
}