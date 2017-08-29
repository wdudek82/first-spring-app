package com.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("myCoach")
public class AikidoCoach implements Coach {

    FortuneService fortuneService;

    @Autowired
    public AikidoCoach(FortuneService randomFortuneService) {
        this.fortuneService = randomFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Calm your mind in silent sitting for 30 minutes every day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
