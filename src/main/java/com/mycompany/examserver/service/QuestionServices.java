/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.service;

import com.mycompany.examserver.database.HibernateQueries;
import com.mycompany.examserver.database.MyHibernateUtil;
import com.mycompany.examserver.model.Question;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Loki
 */
public class QuestionServices {
HibernateQueries hibernateQueries = new HibernateQueries() ;

    List<Question> questionList;
    
    public QuestionServices() {
        
    }

  public List<Question> getQuestions() {
      System.out.println("inne i service");
        return hibernateQueries.getQuestions();
//
    //return null;
//
  }

 public Question getQuestion(int id) {
        return hibernateQueries.getQuestion(id);
       
//    List<Question> list = getQuestions();
//
//        Question question = null;
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == id) {
//                question = list.get(i);
//            }
//        }
//        return question;
        
  }

 public void addQuestion(Question q) {
//        HibernateQueries hq = new HibernateQueries();
//        q = new Question();
//        q.setQuestion("en fråga");
//        System.out.println("Det funkar!" + q.getQuestion());
//        hq.addQuestion(q);
//        //questionList.add(q);
          hibernateQueries.addQuestion(q);

  }

    public void removeQuestion(Question q) {
        questionList.remove(q);
    }

    
    
public Question createQuestion(Question q){  
    return hibernateQueries.createQuestion(q);

       // questionList = getQuestions();
       // questionList.add(q);
       // return q;

 }
    
   public void deleteQuestion(int questionId ) {
        questionList = getQuestions();
        questionList.remove(questionId);
   }

}
