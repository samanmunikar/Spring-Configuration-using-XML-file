package com.cotiviti.com.spring.udemy.springbasic;

public class Fortune implements FortuneService {

    @Override
    public String getFortuneMessage() {
        return "Today is your lucky day";
    }
}
