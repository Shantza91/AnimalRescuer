package org.fasttrackit;

public class App
{
    public static void main( String[] args )
    {
        Animal dog = new Animal("Rex", 5, 9, 6, 10, "dog food", "fetch");
//        System.out.println("Animal name is "+dog.getName()+ " has "+ dog.getAge()+" years, "+dog.getHealth()+" health,"+dog.getHunger()+
//                " hunger,"+dog.getMood()+" mood,"+dog.getFavoriteFood()+" favorite food,"+dog.getFavoritePlayingActivity()+
//                "favorite playing activity");

        Rescuer rescuer = new Rescuer("Ana", 500);
//        System.out.println("Adopter name is"+adopter.getName()+" has:"+adopter.getMoney()+" money.");

        AnimalFood animalFood = new AnimalFood("Pedigree", 50, 10, true);
//        System.out.println("Animal food is:"+animalFood.getName()+" price is:"+animalFood.getPrice()+" quantity is:"+animalFood.getQuantity()+
//                " is in stock:"+animalFood.isStock()+", expiration date is: "+animalFood.getExpirationDate());

        PlayingActivity activity = new PlayingActivity("Fetch");
//        System.out.println("Playing activity is:"+activity.getName());

        Doctor doctor = new Doctor("Henry", "vetrenerian");
//        System.out.println("Doctor is:"+doctor.getName()+" he is a"+doctor.getDomain());

        Canin caine = new Canin("Max",3,9,7,5,"pedigree","fetch","labrador",true);
        Feline pisica = new Feline("Oscar",2,10,4,3,"wiskas","sleeping","siamese", false);

        System.out.println("Numele cainelui este: "+caine.getName());

//        rescuer.feedAnimal(dog, animalFood, 6);
//        rescuer.play(dog, activity);
        rescuer.feedAnimal(dog, animalFood, 4, 4);
        rescuer.play(dog, activity, 3);

//        caine.toString();
        caine.spiritState(7);
    }

}
