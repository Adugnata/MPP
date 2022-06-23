package lesson3.prob2;

import java.util.List;

public class LandlordInfo {
    List<Building> buildingList;

    public LandlordInfo(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public double profit() {
        return buildingList.stream().mapToDouble(Building::profit).sum();
    }
}
