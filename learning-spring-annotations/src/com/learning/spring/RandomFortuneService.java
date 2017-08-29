package com.learning.spring;

import org.springframework.stereotype.Component;


@Component
public class RandomFortuneService implements FortuneService {

    public String getFortune() {
        String[] fortunes = {
                "This is your lucky day!",
                "This is your usuall day.",
                "Be careful today..."
        };

        int randomNumber = (int) (Math.random() * 3);

        return fortunes[randomNumber];
    }

}
