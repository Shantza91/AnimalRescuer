package org.fasttrackit;

public class Rescuer {

    private String name;
    private double money;

    public Rescuer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void feedAnimal(Animal dog, AnimalFood pedigree, double hunger){

        System.out.println(name+" is feeding "+dog.getName()+" with "+pedigree.getName());
        if(dog.getHunger()!=0)
            hunger--;
        System.out.println("Dog hunger level is at "+hunger);
    }



    public void play(Animal dog, PlayingActivity play, double hapinnesLevel){
        System.out.println(name+" is playing "+play.getName()+" with "+dog.getName());
        if(hapinnesLevel>0)
            hapinnesLevel++;
        System.out.println("Happiness level is at "+hapinnesLevel);
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
