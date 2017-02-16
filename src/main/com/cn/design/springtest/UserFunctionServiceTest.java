package com.cn.design.springtest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by lijunhong on 17/2/13.
 */
public class UserFunctionServiceTest{

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserFunctionService bean = context.getBean(UserFunctionService.class);
        bean.sayhello("ni hao ");
        context.close();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        FunctionService bean = context.getBean(FunctionService.class);
        bean.sayhello("nihao");
        context.close();
    }

}