package com.learning.spring;

import org.springframework.stereotype.Component;


@Component
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
        return "Today is your lucky day!";
    }

}
