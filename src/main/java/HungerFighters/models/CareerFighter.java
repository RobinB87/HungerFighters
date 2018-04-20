package HungerFighters.models;

public class CareerFighter extends BaseFighter {

    private String career = "";

    public CareerFighter(String name, int health, boolean isAlive, String gender, String career){
        super(name, health, isAlive, gender);
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
