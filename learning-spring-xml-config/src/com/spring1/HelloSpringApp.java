package com.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        context.close();

        String[] arr = {"aaa", "bbb"};

        System.out.println(arr[0]);

    } // END OF main

}
