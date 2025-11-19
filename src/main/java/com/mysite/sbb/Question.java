package com.mysite.sbb;

import jakarta.persistence.*;
import org.springframework.web.servlet.tags.form.TextareaTag;

import java.time.LocalDateTime;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime createTime;
    @Column(length = 200)
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String content;
}
