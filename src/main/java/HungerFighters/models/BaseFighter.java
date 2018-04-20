package HungerFighters.models;

public abstract class BaseFighter {

    //type of district en gender een interface maken?

    //variables for the base fighter
    private String name;
    private int health;
    private boolean isAlive = true;
    private String gender = "";

    public BaseFighter(String name, int health, boolean isAlive, String gender) {
        this.name = name;
        this.health = health;
        this.isAlive = isAlive;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
