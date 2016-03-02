/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.service;

import com.mycompany.examserver.model.Question;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loki
 */
public class QuestionServices {

    List<Question> questionList;


    public QuestionServices() {

    }

    public List<Question> getQuestions() {

        Question c1 = new Question(1, 1, "fråga 1", "rätt svar", "fel1", "fel3", "fel3");
        Question c2 = new Question(1, 2, "fråga 2", "rätt svar", "fel1", "fel3", "fel3");
        Question c3 = new Question(1, 3, "fråga 3", "rätt svar", "fel1", "fel3", "fel3");
        Question c4 = new Question(1, 4, "fråga 4", "rätt svar", "fel1", "fel3", "fel3");
        Question c5 = new Question(1, 5, "fråga 5", "rätt svar", "fel1", "fel3", "fel3");
        Question c6 = new Question(1, 6, "fråga 6", "rätt svar", "fel1", "fel3", "fel3");
        Question c7 = new Question(1, 7, "fråga 7", "rätt svar", "fel1", "fel3", "fel3");

        questionList = new ArrayList();
        questionList.add(c1);
        questionList.add(c2);
        questionList.add(c3);
        questionList.add(c4);
        questionList.add(c5);
        questionList.add(c6);
        questionList.add(c7);

        return questionList;

    }

    public Question getQuestion(int id) {
        List<Question> list = getQuestions();

        Question question = null;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getQuestionID() == id) {
                question = list.get(i);
            }
        }
        return question;
    }

    public void addQuestion(Question q) {
        questionList.add(q);
    }

    public void removeQuestion(Question q) {
        questionList.remove(q);
    }

        
    public Question createQuestion(Question q){
        questionList = getQuestions();
        q.setQuestionID(questionList.size()+1);
        questionList.add(q);
        
        //questionList = getQuestions();
        //questionList.add(q);
        return q;
    }

}
