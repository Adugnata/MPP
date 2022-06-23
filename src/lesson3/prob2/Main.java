package lesson3.prob2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Apartment[] apts0 = {
                new Apartment(600),
                new Apartment(700)};
        Apartment[] apts1 = {
                new Apartment(500),
                new Apartment(450)
        };
        Apartment[] apts2 = {
                new Apartment(1100),
                new Apartment(650)};

        Apartment[] apts3 = {
                new Apartment(6750),
                new Apartment(945)
        };
        Building[] bldgs = {
                new Building(150, List.of(apts0)),
                new Building(175, List.of(apts1)),
                new Building(150, List.of(apts2)),
                new Building(175, List.of(apts3))
        };
        System.out.println(new LandlordInfo(List.of(bldgs)).profit());
    }
}


