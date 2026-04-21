package lk.tech.twentyfive.composite;

import java.util.ArrayList;
import java.util.List;

class Picture implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    // Додати графічний об'єкт в групу
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Відображення картини:");
        for (Graphic graphic : graphics) {
            graphic.draw(); // Виклик методу відображення для кожного графічного об'єкта
        }
    }
}