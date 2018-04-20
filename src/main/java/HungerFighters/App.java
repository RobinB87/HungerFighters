package HungerFighters;

import HungerFighters.models.FightClass;
import HungerFighters.print.PrintCareerFighters;
import HungerFighters.print.PrintDistrictFighters;

public class App {

    //TODO basefighter niet meer abstract maken mocht ik er niet meer uitkomen. Dan kan ik de createfighter class gebruiken.

    public static void main(String[] args) {
        {
            System.out.println("Welcome to the arena! It's clobbering time!!");
            System.out.println("");

            PrintDistrictFighters printDistrictFighters = new PrintDistrictFighters();
            PrintCareerFighters printCareerFighters = new PrintCareerFighters();
            printDistrictFighters.printDistrictFighters();
            printCareerFighters.printCareerFighters();

            System.out.println("");

            FightClass fightClass = new FightClass();

            fightClass.firstFight();
        }
    }
}
