package com.cn.design.springtest;

/**
 * Created by lijunhong on 17/2/13.
 */
public class UserFunctionService {

    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayhello(String word){
       return functionService.sayhello(word);
    }
}