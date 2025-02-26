package com.aj.quizify.Model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.*;

@Data
@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @ManyToMany
    private List<Question> questions;



}
