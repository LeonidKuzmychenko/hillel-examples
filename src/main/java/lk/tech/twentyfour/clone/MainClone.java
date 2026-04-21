package lk.tech.twentyfour.clone;

import lk.tech.twentyfour.clone.dto.Floor;
import lk.tech.twentyfour.clone.dto.House;
import lk.tech.twentyfour.clone.dto.Roof;
import lk.tech.twentyfour.clone.dto.Wall;

import java.util.List;

public class MainClone {

    public static void main(String[] args) {

        Roof roof = new Roof("tiles");
        Wall wall = new Wall("brick");
        Floor floor = new Floor("concrete");
        House house = new House(roof, List.of(wall), floor);
        System.out.println(house);

        House cloneHouse = house.clone();

        System.out.println(house ==  cloneHouse);
        System.out.println(house.equals(cloneHouse));

        System.out.println(house.getRoof() ==  cloneHouse.getRoof());
        System.out.println(house.getRoof().equals(cloneHouse.getRoof()));
    }
}
