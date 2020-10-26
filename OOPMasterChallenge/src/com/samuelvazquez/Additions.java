package com.samuelvazquez;

public class Additions {
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean olives;
    private double lettucePrice;
    private double tomatoPrice;
    private double onionPrice;
    private double olivesPrice;

    public Additions(boolean lettuce, boolean tomato, boolean onion, boolean olives) {
        if(lettuce) {
            lettucePrice = 2.00;
        }
        this.lettuce = lettuce;
        if(tomato) {
            tomatoPrice = 5.00;
        }
        this.tomato = tomato;
        if(onion) {
            onionPrice = 4.00;
        }
        this.onion = onion;
        if(olives) {
            olivesPrice = 3.00;
        }
        this.olives = olives;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isOlives() {
        return olives;
    }
}
