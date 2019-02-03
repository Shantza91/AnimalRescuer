package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

//    Adopter adopter = new Adopter();
//    Animal dog = new Animal("Rex",);
//    Doctor doctor = new Doctor();

        private List<AnimalFood> availableFood = new ArrayList<>();
        private PlayingActivity[] availableActivities = new PlayingActivity[5];


        private void initFood (int foodCount){
            for(int i = 0; i < foodCount; i++){
                AnimalFood food = new AnimalFood("Wiskas");
                AnimalFood food1 = new AnimalFood("Pedigree");
                availableFood.add(food);
                availableFood.add(food1);
                System.out.println("Added animal food in list: "+food.getName()+" ; "+food1.getName());
            }
        }

        private void initActivities(){
            PlayingActivity playing1 = new PlayingActivity("Jump");
            PlayingActivity playing2 = new PlayingActivity("Roll");

            availableActivities[0] = playing1;
            availableActivities[1] = playing2;
        }

        private void displayAnimalFood(){
            System.out.println("Welcome! Today's available foods are: ");
            for(int i = 0; i<availableFood.size(); i++){
                System.out.println(availableFood.get(i).getName());
            }
        }

        private void displayActivities(){
            System.out.println("Welcome! Today's activities are: ");
            for(int i = 0; i< availableActivities.length; i++){
                if (availableActivities[i] != null){
                    System.out.println(availableActivities[i].getName());
                }
            }
        }

        public void start (){
            initFood(1);
            initActivities();
            displayAnimalFood();
            displayActivities();
        }
}
