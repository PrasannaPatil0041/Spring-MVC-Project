package com.spring.dataConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   
    public static void main(String[] args) {
        System.out.println("Prasanna Patils");
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/dataConnection/config.xml");

        FeedBackDaoo feedbackimpl=(FeedBackDaoo)context.getBean("feedbackdao");
        FeedBack fd=new FeedBack(1,"Very good services","5-Excellent");
        int rs = feedbackimpl.insert(fd);
        System.out.println("Prasanna Patils");
    }
}
