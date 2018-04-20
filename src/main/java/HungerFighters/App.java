package HungerFighters;

import HungerFighters.models.CreateFighter;

public class App {


    public static void main(String[] args) {
        {
            System.out.println("Welcome to the arena!");
            System.out.println("");

            System.out.println("The fighters in the tournament are: ");
            CreateFighter createFighter = new CreateFighter();
            createFighter.CreateMaleFighter();
            createFighter.printFighter();

        }
    }
}
