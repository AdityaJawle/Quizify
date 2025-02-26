package com.aj.quizify.Model;


import lombok.Data;

@Data
public class QuestionWrapper {


    private Integer id;
    private String questionTitle;
    private String question1;
    private String question2;
    private String question3;
    private String question4;


    public QuestionWrapper(Integer id, String questionTitle, String question1, String question2, String question3, String question4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
    }

}
