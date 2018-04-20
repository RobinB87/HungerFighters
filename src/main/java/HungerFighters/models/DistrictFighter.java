package HungerFighters.models;

public class DistrictFighter extends BaseFighter {

    private String district = "";

    public DistrictFighter(String name, int health, boolean isAlive, String gender, String district){
        super(name, health, isAlive, gender);
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
