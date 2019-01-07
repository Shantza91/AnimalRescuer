package org.fasttrackit;

public class Canin extends Animal {

    String species;
    boolean isBarking;

    public Canin(String name, int age, double health, double hunger, double mood, String favoriteFood, String favoritePlayingActivity, String species, boolean isBarking) {
        super(name, age, health, hunger, mood, favoriteFood, favoritePlayingActivity);
        this.species = species;
        this.isBarking = isBarking;
    }
}
