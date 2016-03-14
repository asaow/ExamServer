/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examserver.service;

import com.mycompany.examserver.model.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grupp 2
 */
public class CourseServices {

    List<Course> courseList;

    public CourseServices() {

        courseList = new ArrayList();

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
