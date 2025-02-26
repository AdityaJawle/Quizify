package com.aj.quizify.Dao;

import com.aj.quizify.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer>{

}

