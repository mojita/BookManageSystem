package com.cn.design.domain.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import com.cn.design.domain.domaintest.Address;
import com.cn.design.domain.domaintest.Person;
import com.cn.design.domain.domaintest.School;
import com.cn.design.domain.domaintest.Student;
import com.cn.design.utils.HibernateUtils;

import static com.sun.tools.attach.VirtualMachine.list;

/**
 * Created by lijunhong on 17/2/14.
 */
public class TestRelation extends HibernateUtils{

    //单向多对一,单向多对一的添加
    @Test
    public void testSingleManyToOneAdd(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person person = new Person();
        person.setName("小白");
        person.setSex("女");

        Address address = new Address();
        address.setName("北京");
        person.setAddress(address);

        session.save(person);
        session.save(address);

        transaction.commit();
        session.close();
    }


    //单向多对一的更新
    @Test
    public void testSingleManyToOneUpdate(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //这里的需求是根据姓名查询出addressid,然后修改住址
        Query query = session.createQuery("from Person p where p.name='小白'");
        List<Person> persons = query.list();

        Address address = new Address();
        for (Person p:persons){
            System.out.println(p.getAddress().getId());
            address = p.getAddress();
        }
        address.setName("上海");
        session.update(address);
        transaction.commit();
        session.close();
    }

    //单向多对一的删除:
    @Test
    public void testSingleDeleteManyToOne(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //需求根据person中的任何一个属性找到address然后删除
        //先要解除了主外键关系才能进行删除操作
        Person person = (Person) session.get(Person.class,5);
        Address address = person.getAddress();
        person.setAddress(null);

        session.delete(address);

        transaction.commit();
        session.close();
    }

    //主键关联,单向一对一
    @Test
    public void testSingleOneToOneAdd(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person person = new Person();
        person.setName("小白");
        person.setSex("女");

        Address address = new Address();
        address.setName("北京");
        person.setAddress(address);
        session.save(address);//先要保存外键对象
        session.save(person);

        transaction.commit();
        session.close();
    }

    //student和school的单向一对多操作
    @Test
    public void testSingleaOneToManyAdd(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student student1 = new Student();
        student1.setName("张三1");

        Student student2 = new Student();
        student2.setName("张三2");

        Student student3 = new Student();
        student3.setName("张三3");



        School school = new School();
        school.setName("北大");

        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        school.setStudents(students);

        session.save(school);
        session.save(student1);
        session.save(student2);
        session.save(student3);

        transaction.commit();
        session.close();
    }



}
