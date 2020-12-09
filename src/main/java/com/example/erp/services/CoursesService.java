package com.example.erp.services;

import com.example.erp.bean.Courses;
import com.example.erp.dao.impl.CoursesDAOImpl;

public class CoursesService {
    public void addCourse(String name, String description, Integer credits) {
        Courses course = new Courses(name, description, credits);
        new CoursesDAOImpl().addCourse(course);
    }
}
