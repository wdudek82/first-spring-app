package com.spring1;

public class ChessCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Solve 5 chess scenarios";
    }

    @Override
    public String getDailyFortune() {
        return "";
    }

}
