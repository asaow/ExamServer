/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.service;

import com.mycompany.examserver.model.Course;
import com.mycompany.examserver.model.Question;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Loki
 */
public class CourseServices {

    List<Course> courseList;

    public CourseServices() {
        Course c1 = new Course(1, "EFF", 1);
        Course c2 = new Course(2, "OOP", 2);
        Course c3 = new Course(3, "HAJ", 3);

        courseList = new ArrayList();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);

    }

    public List<Course> getCourses() {
        
        return courseList;

    }

    public Course getCourse(int courseID) {
        Course course = null;

        List<Course> list = getCourses();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == courseID) {
                course = list.get(i);
            }
        }
        return course;

    }

    public Course createCourse(Course c) {
        courseList = getCourses();
        courseList.add(c);
        return c;
    }

}
