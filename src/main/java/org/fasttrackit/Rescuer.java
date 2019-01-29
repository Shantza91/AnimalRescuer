package org.fasttrackit;

public class Rescuer {

    private String name;
    private double money;

    public Rescuer(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void feedAnimal(Animal dog, AnimalFood pedigree, double hunger, double mood){

        System.out.println(name+" is feeding "+dog.getName()+" with "+pedigree.getName());
        if(dog.getHunger()!=0){
            hunger--;
        System.out.println("Dog hunger level is at "+hunger);
        }
        if( pedigree.getName() == "Pedigree"){
            mood += 1;
            System.out.println("Dog is fed, he is at "+mood+" mood level");
        }
    }

    public void play(Animal dog, PlayingActivity play, double hapinnesLevel){
        System.out.println(name+" is playing "+play.getName()+" with "+dog.getName());
        if(play.getName() == "Fetch"){
            hapinnesLevel+=2;
        System.out.println("Dog is playing favorite playing activity, hapinnes level is at "+hapinnesLevel);}
        else {
            hapinnesLevel+=1;
        System.out.println("Happiness level is at "+hapinnesLevel);}
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
