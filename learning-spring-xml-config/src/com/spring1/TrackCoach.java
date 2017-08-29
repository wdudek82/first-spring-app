package com.spring1;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public TrackCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;

    }

    @Override
    public String getDailyWorkout() {

        return "Run a hard 5k";

    }

    @Override
    public String getDailyFortune() {

        return "Track Coach: " + this.fortuneService;

    }

    // add an init method
    public void doSomeStuff() {
        System.out.println("TrackCoach: init");
    }

    // add a destroy method
    public void doSomeOtherStuff() {
        System.out.println("TrackCoach: destroy");
    }

}
