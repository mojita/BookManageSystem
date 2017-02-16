package com.cn.design.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lijunhong on 17/2/13.
 */
@Configuration
public class Config {

    @Bean
    public FunctionService function(){
        return new FunctionService();
    }

}
