package com.cotiviti.com.spring.udemy.springbasic;

public class CricketCoach implements Coach {
    private  Fortune fortune;
    private String team;
    private String emailAddress;

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public CricketCoach(){
        System.out.println("This is a no-arg construnctor");
    }

    public void setFortune(Fortune theFortune){
        System.out.println("Inside set fortune");
        this.fortune=theFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Lets do it!!";
    }
}
