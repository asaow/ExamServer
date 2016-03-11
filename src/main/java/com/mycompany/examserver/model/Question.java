/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Loki
 */
@Entity
@XmlRootElement
public class Question implements Serializable {
    
    @Id @GeneratedValue
    private int id;
    private String question;
    private int courseId = 1;
    public static final String RADIO_TYPE = "ETT SVAR";
    public static final String CHECKBOX_TYPE = "FLERA SVAR";
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static String getRADIO_TYPE() {
        return RADIO_TYPE;
    }

    public static String getCHECKBOX_TYPE() {
        return CHECKBOX_TYPE;
    }


    @OneToMany(cascade = CascadeType.ALL)//, mappedBy ="question")
    private Collection<Answer>answers= new ArrayList<Answer>();

    public Collection<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Collection<Answer> answers) {
        this.answers = answers;
    }
    
        
    public Question(){
        
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
