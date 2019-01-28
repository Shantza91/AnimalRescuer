package org.fasttrackit;

public class Canin extends Animal {

    private String species;
    private boolean isBarking;

    public Canin(String name, int age, double health, double hunger, double mood, String favoriteFood, String favoritePlayingActivity, String species, boolean isBarking) {
        super(name, age, health, hunger, mood, favoriteFood, favoritePlayingActivity);
        this.species = species;
        this.isBarking = isBarking;
    }

    @Override
    public void spiritState(double mood) {
        if (species == "cat")
            System.out.println("Cat is miauing");
        else if(species == "dog")
            System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Canin{" +
                "isBarking=" + isBarking +
                '}';
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
