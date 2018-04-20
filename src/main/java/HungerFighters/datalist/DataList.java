package HungerFighters.datalist;

import HungerFighters.models.CareerFighter;
import HungerFighters.models.DistrictFighter;

import java.util.ArrayList;
import java.util.List;

public class DataList {

    //class is not used at this moment.
    //TODO replace these lists with the lists in the CreateFighter classes

    //list to store fighters
    private List<DistrictFighter> districtFighterList = new ArrayList<>();
    private List<CareerFighter> careerFighterList = new ArrayList<>();

    public List<DistrictFighter> getDistrictFighterList(){
        return districtFighterList;
    }

    public List<CareerFighter> getCareerFighterList(){
        return careerFighterList;
    }
}
