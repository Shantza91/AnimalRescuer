package org.fasttrackit;

public class Feline extends Animal {

    private String species;
    private boolean isMiauing;

    public Feline(String name, int age, double health, double hunger, double mood, String favoriteFood, String favoritePlayingActivity, String species, boolean isMiauing) {
        super(name, age, health, hunger, mood, favoriteFood, favoritePlayingActivity);
        this.species = species;
        this.isMiauing = isMiauing;
    }

    @Override
    public String toString() {
        return "Feline{" +
                "isMiauing=" + isMiauing +
                '}';
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isMiauing() {
        return isMiauing;
    }

    public void setMiauing(boolean miauing) {
        isMiauing = miauing;
    }
}
