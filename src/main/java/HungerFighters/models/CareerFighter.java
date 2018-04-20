package HungerFighters.models;

public class CareerFighter extends BaseFighter {

    boolean battleItem = true;
    boolean attackBonus = true;

    public CareerFighter(String name, int health, boolean isAlive, String gender, int attackPower, boolean battleItem, boolean attackBonus) {
        super(name, health, isAlive, gender, attackPower);
        this.battleItem = battleItem;
        this.attackBonus = attackBonus;
    }

    public boolean isBattleItem() {
        return battleItem;
    }

    public void setBattleItem(boolean battleItem) {
        this.battleItem = battleItem;
    }

    public boolean isAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(boolean attackBonus) {
        this.attackBonus = attackBonus;
    }
}
