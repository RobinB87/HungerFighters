package HungerFighters.models;

public class DistrictFighter extends BaseFighter {

    boolean bonusDefence = true;

    public DistrictFighter(String name, int health, boolean isAlive, String gender, int attackPower, boolean bonusDefence){
        super(name, health, isAlive, gender, attackPower);
        this.bonusDefence = bonusDefence;
    }

    public boolean isBonusDefence() {
        return bonusDefence;
    }

    public void setBonusDefence(boolean bonusDefence) {
        this.bonusDefence = bonusDefence;
    }
}
