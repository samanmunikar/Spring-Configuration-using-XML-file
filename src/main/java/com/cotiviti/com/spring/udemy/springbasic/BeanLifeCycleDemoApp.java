package com.cotiviti.com.spring.udemy.springbasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //Retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        //use methods

        //close the context
        context.close();
    }
}
