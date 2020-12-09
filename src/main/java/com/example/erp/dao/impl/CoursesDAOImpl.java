package com.example.erp.dao.impl;

import com.example.erp.bean.Courses;
import com.example.erp.dao.CoursesDAO;
import com.example.erp.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class CoursesDAOImpl implements CoursesDAO {

    @Override
    public void addCourse(Courses course) {
        try(Session session = SessionUtil.getSession())
        {
            session.beginTransaction();
            Integer id  = (Integer)session.save(course);
            System.out.println("Course created with id:"+id);
            session.getTransaction().commit();
        }
        catch (HibernateException e){
            e.printStackTrace();
        }
    }
}
