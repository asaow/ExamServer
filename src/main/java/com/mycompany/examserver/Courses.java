/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver;

import com.mycompany.examserver.model.Course;
import com.mycompany.examserver.service.CourseServices;
import java.util.List;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Loki
 */

@Path("/courses")
public class Courses {
    CourseServices courseService = new CourseServices();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getCourses() {
       return courseService.getCourses();
    }
    
    @Path("/{courseId}/questions")
    @Produces(MediaType.APPLICATION_JSON)
    public Questions test(){
        return (new Questions());
    }

    @GET
    @Path("/{courseId}") 
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Course getCourse(@PathParam("courseId") int courseId) {
        return courseService.getCourse(courseId); 

    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Course createCourse(Course c) {
        if (c == null)
            throw new BadRequestException();    
        Course course = courseService.createCourse(c);
        System.out.println("added course");
        return course;   
   }

}
