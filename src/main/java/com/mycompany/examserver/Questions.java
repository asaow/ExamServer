/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.examserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.mycompany.examserver.model.Question;
import com.mycompany.examserver.service.QuestionServices;
import java.util.List;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;

/**
 *
 * @author Loki
 */
@Path("/")
public class Questions {

    QuestionServices questionService = new QuestionServices();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Question> getQuestions() {
        return questionService.getQuestions();
    }

    @GET
    @Path("/{questionID}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Question getQuestion(@PathParam("questionID") int questionID) {
        return questionService.getQuestion(questionID); //ska skrivas i QuestionServices
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String addQuestion(Question q) {
        questionService.addQuestion(q);

        return "Ok added question";
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Question createQuestion(Question q) {
        if (q == null)
            throw new BadRequestException();    
        Question question = questionService.createQuestion(q);

        return question;   
   }
    

    

}