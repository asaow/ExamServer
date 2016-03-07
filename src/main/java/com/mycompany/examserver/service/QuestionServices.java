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

        Question c1 = new Question(1, 1, "Vem har skrivit böckerna som Game of Thrones bygger på?", "George RR Martin", "JRR Tolkien", "JV Jones", "JK Rowling");
        Question c2 = new Question(1, 2, "Vem spelade i Game of Thrones Stark-släktens överhuvud Ned Stark?", "Sean Bean", "Kit Harington", "Iain Glen", "Conleth Hill");
        Question c3 = new Question(1, 3, "Vilken familj i Game of Thrones anses vara besläktade med drakarna?", "House Targaryen", "House Stark", "House Tyrell", "House Lannister");
        Question c4 = new Question(1, 4, "Vilken konspirerande karaktär har smeknamnet Littlefinger i Game of Thrones?", "Petyr Baelish", "Sansa Stark", "Jaime Lannister", "Joffrey Baratheon");
        Question c5 = new Question(1, 5, "Vad är husets Lannisters motto?", "Hear Me Roar", "Family, Duty, Honor", "Winter is Coming", "Unbowed, Unbent, Unbroken");
        Question c6 = new Question(1, 6, "Vad föreställer huset Targaryens vapensköld?", "En trehövdad drake", "en vanlig drake", "en lejon", "en varg");
        Question c7 = new Question(1, 7, "As High as Honor, säger vilka?", "House Arryn", "House Baratheon", "House Bolton", "House Stark");
        Question c8 = new Question(1, 8, "Vilka har mottot, Growing Strong?", "House Tyrell", "House Arryn", "House Martell", "House Tyrell");
        Question c9 = new Question(1, 9, "Vilka säger, We do not Sow?", "House Greyjoy", "House Lannister", "House Stark", "House Martell");
        Question c10 = new Question(1, 10, "Winter is Coming, säger vilka?", "House Stark", "House Arryn", "House Lannister", "House Targaryen");
        Question c11 = new Question(1, 11, "Vilka har mottot, Fire and Blood?", "House Targaryen", "House Stark", "House Greyjoy", "House Lannister");
        Question c12 = new Question(1, 12, "Unbowed, Unbent, Unbroken, vilka säger så?", "House Martell", "House Stark", "House Lannister", "House Baratheon");
        Question c13 = new Question(1, 13, "Vilka har mottot, Family, Duty, Honor?", "House Tully", "House Martell", "House Bolton", "House Lannister");
        Question c14 = new Question(1, 14, "Vilka säger, Ours is the Fury?", "House Baratheon", "House Targaryen", "House Greyjoy", "House Arryn");
        
        questionList = new ArrayList();
        questionList.add(c1);
        questionList.add(c2);
        questionList.add(c3);
        questionList.add(c4);
        questionList.add(c5);
        questionList.add(c6);
        questionList.add(c7);
        questionList.add(c8);
        questionList.add(c9);
        questionList.add(c10);
        questionList.add(c11);
        questionList.add(c12);
        questionList.add(c13);
        questionList.add(c14);

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

        
//    public Question createQuestion(Question q){
//        Question que = new Question();
//        que.setAnswer(q.getAnswer());
//        que.setQuestion(q.getQuestion());
//        
//        questionList = getQuestions();
//        q.setQuestionID(questionList.size()+1);
//        questionList.add(q);
//        
//        //questionList = getQuestions();
//        //questionList.add(q);
//        return que;
//    }
    
    
        public Question createQuestion(Question q){    
        questionList = getQuestions();
        questionList.add(q);
        return q;
    }
    
    public void deleteQuestion(int questionId ) {
        questionList = getQuestions();
        questionList.remove(questionId);
    }

}
