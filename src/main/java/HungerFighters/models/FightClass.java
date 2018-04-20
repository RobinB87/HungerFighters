package HungerFighters.models;

import java.util.Collections;

public class FightClass {

    //neem fighters uit de create carreer en create district fighters classes en gebruik get health

    CreateDistrictFighter createDistrictFighter = new CreateDistrictFighter();
    CreateCareerFighter createCareerFighter = new CreateCareerFighter();

    //select random fighter from a list
    public void firstFight() {

        createCareerFighter.createMaleCareerFighter();

        System.out.println("The fight begins!");

        Collections.shuffle(createCareerFighter.careerFighterList);
        for(CareerFighter fighter : createCareerFighter.careerFighterList) {

            System.out.println(fighter.getName());
            System.out.println(fighter.getHealth());
            System.out.println(fighter.getAttackPower());
        }

    }
}
