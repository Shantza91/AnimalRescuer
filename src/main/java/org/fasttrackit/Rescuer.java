package org.fasttrackit;

public class Rescuer {

    private String name;
    private double money;

    public Rescuer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void feedAnimal(Animal dog, AnimalFood pedigree){

        System.out.println(name+" is feeding "+dog.getName()+" with "+pedigree.getName());
    }

    public void play(Animal dog, PlayingActivity play){
        System.out.println(name+" is playing "+play.getName()+" with "+dog.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
