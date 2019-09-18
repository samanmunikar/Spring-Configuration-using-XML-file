package com.cotiviti.com.spring.udemy.springbasic;

public class TrackCoach  implements Coach{
    private Fortune fortune;

    public TrackCoach (Fortune thefortune){
        this.fortune = thefortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Stay on track for 200km";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortuneMessage();
    }

    //add an init method
    public void doMyStartupStuff(){
        System.out.println("TrachCoach: inside method doMyStartupStuff");
    }

    //add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrachCoach: inside method doMyCleanupStuff");
    }
}
