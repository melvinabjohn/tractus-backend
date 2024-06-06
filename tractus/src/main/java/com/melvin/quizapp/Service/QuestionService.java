package com.melvin.quizapp.Service;

import com.melvin.quizapp.Dao.QuestionDao;
import com.melvin.quizapp.Models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions(){
        return questionDao.findAll();
    }
}
