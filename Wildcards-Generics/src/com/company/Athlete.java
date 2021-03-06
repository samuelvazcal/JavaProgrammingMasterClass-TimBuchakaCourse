package com.company;

public class Athlete extends User{

    private String sport;

    public Athlete(String name, String sport) {
        super(name);
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
