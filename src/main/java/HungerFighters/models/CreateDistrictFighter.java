package HungerFighters.models;

import HungerFighters.datalist.DataList;

import java.util.ArrayList;
import java.util.List;

public class CreateDistrictFighter {

    //list to store career fighters TODO moet eigenlijk naar list class
    public List<DistrictFighter> districtFighterList = new ArrayList<>();

    DataList dataList = new DataList();

    //TODO 1 loop maken waarin male en female fighters worden gecreeerd?

    //create male districtfighters through loop
    public void createMaleDistrictFighter(){
        for(int i = 1; i <= 4; i++){
            DistrictFighter districtFighter = new DistrictFighter("District Fighter" + i, 120, true, "male", 10, true );
          //  districtFighterList.add(districtFighter);
            dataList.getDistrictFighterList().add(districtFighter);
        }
    }

    //create female districtfighters through loop
    public void createFemaleDistrictFighter(){
        for(int i = 5; i <= 6; i++){
            DistrictFighter districtFighter = new DistrictFighter("District Fighter" + i, 120, true, "male", 10, true );
           // districtFighterList.add(districtFighter);
            dataList.getDistrictFighterList().add(districtFighter);
        }
    }
}
