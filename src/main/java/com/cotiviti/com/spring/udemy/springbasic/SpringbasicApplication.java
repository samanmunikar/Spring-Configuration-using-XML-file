package com.cotiviti.com.spring.udemy.springbasic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbasicApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbasicApplication.class, args);
        //load Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext.xml");
        //Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
//        System.out.println(System.getProperty("java.class.path"));
        //call methods
        System.out.println(theCoach.getDailyWorkout());
        //close the context
        context.close();
    }

}
