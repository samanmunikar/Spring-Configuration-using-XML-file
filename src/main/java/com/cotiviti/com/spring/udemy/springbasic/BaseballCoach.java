package com.cotiviti.com.spring.udemy.springbasic;

public class BaseballCoach implements Coach{
    private Fortune fortune;

    public BaseballCoach(Fortune thefortune) {
        this.fortune = thefortune;
    }

    public String getDailyWorkout(){
        return "Run 200 km a day";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortuneMessage();
    }
}
