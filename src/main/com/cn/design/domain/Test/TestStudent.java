package com.cn.design.domain.Test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import com.cn.design.domain.domaintest.Student;
import com.cn.design.utils.HibernateUtils;

/**
 * Created by lijunhong on 17/2/14.
 */
public class TestStudent extends HibernateUtils{


    @Test
    public void test1(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setName("小强");
        session.save(student);

        transaction.commit();
        session.close();
    }

}
