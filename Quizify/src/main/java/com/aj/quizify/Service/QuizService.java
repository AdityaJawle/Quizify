package com.aj.quizify.Service;




import com.aj.quizify.Dao.QuestionDao;
import com.aj.quizify.Dao.QuizDao;
import com.aj.quizify.Model.Question;
import com.aj.quizify.Model.QuestionWrapper;
import com.aj.quizify.Model.Quiz;
import com.aj.quizify.Model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title){
        List<Question> questions = questionDao.findRandomQuestionByCategory(category, numQ);


        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }



    public ResponseEntity<List<QuestionWrapper>> getQuiz(Integer id){
        Optional<Quiz> quiz = quizDao.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();

        for (Question q : questionsFromDB) {
            QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestionTitle(), q.getQuestion1(),q.getQuestion2(), q.getQuestion3(), q.getQuestion4());
            questionsForUser.add(qw);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }




    public ResponseEntity<Integer> submitQuiz(Integer id, List<Response> responses){

        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int right = 0;
        int i = 0;
        for (Response response : responses){
            if (response.getResponse().equals(questions.get(i).getRightAnswer()))
                right++;

            i++;

        }
        return new ResponseEntity<>(right,HttpStatus.OK);
    }
}

