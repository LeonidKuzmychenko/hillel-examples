package lk.tech.thirteen.circle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private final List<String> equipment = Collections.synchronizedList(new ArrayList<>());

    public void addEquipment(String equipment) {
        this.equipment.add(equipment);
    }

    @Override
    public String toString() {
        return "Person{" +
                "equipment=" + equipment +
                '}';
    }
}
