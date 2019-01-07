package org.fasttrackit;

public class Feline extends Animal {

    String species;
    boolean isMiauing;

    public Feline(String name, int age, double health, double hunger, double mood, String favoriteFood, String favoritePlayingActivity, String species, boolean isMiauing) {
        super(name, age, health, hunger, mood, favoriteFood, favoritePlayingActivity);
        this.species = species;
        this.isMiauing = isMiauing;
    }
}
