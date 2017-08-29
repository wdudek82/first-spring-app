package com.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        String workout = theCoach.getDailyWorkout();
        String fortune = theCoach.getDailyFortune();

        System.out.println("Workout: " + workout);
        System.out.println("Fortune: " + fortune);

        context.close();
    }

}
