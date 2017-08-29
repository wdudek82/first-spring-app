package com.spring1;

public class ChessCoach implements Coach {

    private FortuneService fortuneService;

    public ChessCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;

    }

    @Override
    public String getDailyWorkout() {

        return "Solve 5 chess scenarios";

    }

    @Override
    public String getDailyFortune() {

        return "Chess Coach: " + this.fortuneService.getFortune();

    }

}
