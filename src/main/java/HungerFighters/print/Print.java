package HungerFighters.print;


import HungerFighters.models.CareerFighter;
import HungerFighters.models.CreateCareerFighter;

public class Print {

    public void printFighters() {
        CreateCareerFighter createCareerFighter = new CreateCareerFighter();
        createCareerFighter.createMaleCareerFighter();
        createCareerFighter.createFemaleCareerFighter();

        System.out.println("The CareerFighters for this tournament are: ");
        System.out.println("");
        for (CareerFighter currentCareerFighter : createCareerFighter.careerFighterList) {
            System.out.println(currentCareerFighter.getName());
            System.out.println("------------------");
            System.out.println("gender: " + currentCareerFighter.getGender());
            System.out.println("health: " + currentCareerFighter.getHealth());
            System.out.println("status: is alive: " + currentCareerFighter.isAlive());
            System.out.println("");
        }
    }
}
