package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private double health;
    private double hunger;
    private double mood;
    private String favoriteFood;
    private String favoritePlayingActivity;

    public Animal(String name, int age, double health, double hunger, double mood, String favoriteFood, String favoritePlayingActivity) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.hunger = hunger;
        this.mood = mood;
        this.favoriteFood = favoriteFood;
        this.favoritePlayingActivity = favoritePlayingActivity;
    }

    public void spiritState(double mood){
        if (mood >= 8)
            System.out.println("Animal is in a good");
        else if (mood > 4 && mood <8)
            System.out.println("Animal is in a not bad mood");
        else if (mood < 0 && mood >4)
            System.out.println("Animal is in a bad mood");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHealth() {
        return health;
    }

    public double getHunger() {
        return hunger;
    }

    public double getMood() {
        return mood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoritePlayingActivity() {
        return favoritePlayingActivity;
    }
}
