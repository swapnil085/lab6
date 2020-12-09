package com.example.erp.services;

import com.example.erp.bean.Students;
import com.example.erp.dao.impl.StudentsDAOImpl;


public class StudentsService {
    public void addStudent(Students student){
        new StudentsDAOImpl().addStudent(student);
    }
}
