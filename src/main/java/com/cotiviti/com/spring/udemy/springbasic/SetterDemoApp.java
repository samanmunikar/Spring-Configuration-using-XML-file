package com.cotiviti.com.spring.udemy.springbasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args){
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve the bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close context
        context.close();
    }
}
