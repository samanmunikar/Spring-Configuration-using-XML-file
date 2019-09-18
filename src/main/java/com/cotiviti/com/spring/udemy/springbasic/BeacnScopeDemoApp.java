package com.cotiviti.com.spring.udemy.springbasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeacnScopeDemoApp {

    public static void main(String[] args){

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //Retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPoint to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
        //use methods

        //close the context
        context.close();
    }
}
