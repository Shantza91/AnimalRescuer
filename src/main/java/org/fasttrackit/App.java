package org.fasttrackit;

public class App
{
    public static void main( String[] args )
    {
        Animal dog = new Animal("Rex", 5, 9, 6, 10, "dog food", "fetch");
        Animal cat = new Animal("Felix", 2, 8, 4, 7, "cat food", "playing");
        Rescuer rescuer = new Rescuer("Ana", 500);
        AnimalFood animalFood = new AnimalFood("Pedigree", 50, 10, true);
        PlayingActivity activity = new PlayingActivity("Fetch");
        Doctor doctor = new Doctor("Henry", "vetrenerian");
        Canin caine = new Canin("Max",3,9,7,5,"pedigree","fetch","labrador",true);
        Feline pisica = new Feline("Oscar",2,10,4,3,"wiskas","sleeping","siamese", false);

//        System.out.println("Numele cainelui este: "+caine.getName());

//        rescuer.feedAnimal(dog, animalFood, 6);
//        rescuer.play(dog, activity);
//        rescuer.feedAnimal(dog, animalFood, 4, 4);
//        rescuer.play(dog, activity, 3);

//        caine.toString();
//        dog.spiritState(7);
//        cat.spiritState(4);

        Game game = new Game();
        game.start();
    }

}
