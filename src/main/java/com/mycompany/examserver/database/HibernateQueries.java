/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.database;

import com.mycompany.examserver.model.Answer;
import com.mycompany.examserver.model.Question;
import java.util.Collection;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Grupp 2
 */
public class HibernateQueries {

    SessionFactory sessionFactory = MyHibernateUtil.getSessionFactory();

    public Question getQuestion(int questionId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Question q = (Question) session.get(Question.class, questionId);
        Collection<Answer> answers = q.getAnswers();
        for (Answer a : answers) {
            System.out.println(a.getId() + ", " + a.getCorrect());
        }
        session.getTransaction().commit();
        session.close();

        return q;

    }

    public List<Question> getQuestions() {
        Session session = sessionFactory.openSession();
        System.out.println("Början av session");

        session.beginTransaction();
        List<Question> questions = session.createCriteria(Question.class).list();
        for (Question q : questions){
            q.getAnswers();
        }
        System.out.println("size: " + questions.size());
        System.out.println("after get session");
        session.getTransaction().commit();
        //session.close();
        return questions;

    }

    public Question createQuestion(Question q) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(q);

        session.getTransaction().commit();
        session.close();

        return q;

    }

    public void deleteQuestion(int questionId) {
        SessionFactory sessionFactory = MyHibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Question q = (Question) session.get(Question.class, questionId);
        session.delete(q);

        session.getTransaction().commit();
        session.close();
    }


}
