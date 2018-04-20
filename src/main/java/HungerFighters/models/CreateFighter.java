package HungerFighters.models;

import java.util.ArrayList;
import java.util.List;

public class CreateFighter {

    //Create list to store fighters
    public List<BaseFighter> fighterList = new ArrayList<>();

    //Create for loop to create fighter objects
    public void CreateMaleFighter() {

        for (int i = 1; i <= 12; i++) {
            BaseFighter fighter = new BaseFighter("fighter"+ i, 100, true, "male");
            fighterList.add(fighter);
        }
    }

    //print fighter: needs to be moved to print class
    public void printFighter() {
        System.out.println("");
        for (BaseFighter currentFighter : fighterList) {
            System.out.println(currentFighter.getName());
            System.out.println("------------------");
            System.out.println("health is: " + currentFighter.getHealth());
            System.out.println("alive: " + currentFighter.isAlive());
            System.out.println("gender: " + currentFighter.getGender());
            System.out.println("");
        }
    }
}
