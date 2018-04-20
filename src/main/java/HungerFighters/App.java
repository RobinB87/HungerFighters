package HungerFighters;

import HungerFighters.print.Print;

public class App {

    //TODO basefighter niet meer abstract maken mocht ik er niet meer uitkomen. Dan kan ik de createfighter class gebruiken.

    public static void main(String[] args) {
        {
            System.out.println("Welcome to the arena! It's clobbering time!!");
            System.out.println("");

            System.out.println("The fighters in the tournament are: ");
//            CreateFighter createFighter = new CreateFighter();
//            createFighter.CreateMaleFighter();
//            createFighter.printFighter();

            Print print = new Print();
            print.printFighters();


        }
    }
}
