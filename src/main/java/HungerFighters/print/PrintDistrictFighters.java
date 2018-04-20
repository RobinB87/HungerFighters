package HungerFighters.print;

import HungerFighters.models.CreateDistrictFighter;
import HungerFighters.models.DistrictFighter;

public class PrintDistrictFighters {

    public void printDistrictFighters() {

        CreateDistrictFighter createDistrictFighter = new CreateDistrictFighter();
        createDistrictFighter.createMaleDistrictFighter();
        createDistrictFighter.createFemaleDistrictFighter();

        System.out.println("The district fighters for this tournament are: ");
        System.out.println("");
        for (DistrictFighter currentDistrictFighter : createDistrictFighter.districtFighterList) {
            System.out.println(currentDistrictFighter.getName());
            System.out.println("------------------");
            System.out.println("gender: " + currentDistrictFighter.getGender());
            System.out.println("health: " + currentDistrictFighter.getHealth());
            System.out.println("status: is alive: " + currentDistrictFighter.isAlive());
            System.out.println("attack power: " + currentDistrictFighter.getAttackPower());
            System.out.println("has defense bonus: " + currentDistrictFighter.isBonusDefence());
            System.out.println("");
        }
    }
}
