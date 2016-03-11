/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.service;

import com.mycompany.examserver.database.HibernateQueries;
import com.mycompany.examserver.model.Question;
import java.util.List;

/**
 *
 * @author Loki
 */
public class QuestionServices {

    HibernateQueries hibernateQueries = new HibernateQueries();

    List<Question> questionList;

    public QuestionServices() {

    }

    public List<Question> getQuestions() {
        System.out.println("inne i service");
        return hibernateQueries.getQuestions();
    }

    public Question getQuestion(int id) {
        return hibernateQueries.getQuestion(id);
    }

    public Question createQuestion(Question q) {
        return hibernateQueries.createQuestion(q);
    }

    public void deleteQuestion(int questionId) {
        hibernateQueries.deleteQuestion(questionId);

    }

}
