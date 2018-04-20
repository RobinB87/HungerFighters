package HungerFighters.print;

import HungerFighters.models.CareerFighter;
import HungerFighters.models.CreateCareerFighter;

public class PrintCareerFighters {

    public void printCareerFighters() {
        CreateCareerFighter createCareerFighter = new CreateCareerFighter();
        createCareerFighter.createMaleCareerFighter();
        createCareerFighter.createFemaleCareerFighter();

        System.out.println("The career fighters for this tournament are: ");
        System.out.println("");
        for (CareerFighter currentCareerFighter : createCareerFighter.careerFighterList) {
            System.out.println(currentCareerFighter.getName());
            System.out.println("------------------");
            System.out.println("gender: " + currentCareerFighter.getGender());
            System.out.println("health: " + currentCareerFighter.getHealth());
            System.out.println("status: is alive: " + currentCareerFighter.isAlive());
            System.out.println("attack power: " + currentCareerFighter.getAttackPower());
            System.out.println("has battle item: " + currentCareerFighter.isBattleItem());
            System.out.println("has attack bonus: " + currentCareerFighter.isAttackBonus());
            System.out.println("");
        }
    }
}