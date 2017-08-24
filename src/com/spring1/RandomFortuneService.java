package com.spring1;



public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {
            "This is your lucky day!",
            "This is your usual day.",
            "You should be careful...",
            "Something interesting on the horizon.",
            "My vision is blurry...",
    };

    @Override
    public String getFortune() {
        int randomFortune = (int) Math.round(Math.random() * 5);

        return this.fortunes[randomFortune];
    }
}
