package com.cn.design.domain.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import com.cn.design.domain.domaintest.Person;
import com.cn.design.utils.HibernateUtils;

/**
 * Created by lijunhong on 17/2/13.
 */
public class TestPerson extends HibernateUtils {

    @Test
    public void testAddPerson(){

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person p = new Person();
        p.setName("张三22");
        p.setSex("男");

        session.save(p);
        transaction.commit();
        session.close();


    }


    //查询所有的值
    @Test
    public void testQueryPersonList(){
        Session session = sessionFactory.openSession();

        List<Person> persons = session.createQuery("from Person").list();
        for (Person p:persons)
            System.out.println(p.getName());

        session.close();
    }

    //按照主键查询数据库中的值
    @Test
    public void testQueryPerson(){
        Session session = sessionFactory.openSession();

        Person person = (Person)session.get(Person.class,3);

        System.out.println(person.getName());
        session.close();
    }

    @Test
    public void deletePerson(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //1.现将id从数据库中查询出来
        Person person = (Person)session.get(Person.class,1);
        //2.把对象删除
        session.delete(person);

        transaction.commit();
        session.close();
    }

    //hibernate内部会检查标识符,看标识符中相应的表中有没有相应的记录(如果没有找到相应的的表示则报错)
    @Test
    public void deletePerson2(){
        //创建一个新的person对象
        //给这个对象的表示赋值
        //将这个对象删除

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person p = new Person();
        p.setPid(2);
        session.delete(p);

        transaction.commit();
        session.close();
    }

    //这是一种方法
    @Test
    public void testUpdata1(){
        //根据id从数据库中找到持久化对象
        //将对象进行修改
        //然后将持久化对象再执行update操作

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Person person = (Person) session.get(Person.class,3);
        person.setName("李四");

        session.update(person);

        transaction.commit();
        session.close();
    }

    @Test
    public void testUpdata2(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //第二种方法也是和删除的第二种方法一样
        //创建一个新对象,将要修改的标识符设置上去
        //获取到持久化对象,然后进行修改,但是这种修改要将所有的属性都进行修改

        Person person = new Person();
        person.setPid(3);

        person.setName("小花");
        person.setSex("女");

        session.update(person);

        transaction.commit();
        session.close();
    }

}
