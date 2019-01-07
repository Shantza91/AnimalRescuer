package org.fasttrackit;

public class Canin extends Animal {

    private String species;
    private boolean isBarking;

    public Canin(String name, int age, double health, double hunger, double mood, String favoriteFood, String favoritePlayingActivity, String species, boolean isBarking) {
        super(name, age, health, hunger, mood, favoriteFood, favoritePlayingActivity);
        this.species = species;
        this.isBarking = isBarking;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isBarking() {
        return isBarking;
    }

    public void setBarking(boolean barking) {
        isBarking = barking;
    }
}
