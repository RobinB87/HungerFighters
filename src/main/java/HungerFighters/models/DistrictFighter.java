package HungerFighters.models;

public class DistrictFighter extends BaseFighter {

    boolean bonusDefence = true;

    public DistrictFighter(String name, int health, boolean isAlive, String gender, boolean bonusDefence){
        super(name, health, isAlive, gender);
        this.bonusDefence = bonusDefence;
    }

}
