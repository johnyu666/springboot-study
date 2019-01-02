package com.example.myspringboot1.bean;

import com.example.myspringboot1.JdbcCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Conditional(JdbcCondition.class)
@Configuration
public class MyBean {
    public MyBean() {
        System.out.println("my bean constructing.....");
    }
}
