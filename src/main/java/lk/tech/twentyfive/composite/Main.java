package lk.tech.twentyfive.composite;

public class Main {
    public static void main(String[] args) {
        // Створення складової картини
        Picture picture = new Picture();
        picture.add(new Line()); // Додати лінію до картини
        picture.add(new Line()); // Додати ще одну лінію до картини
        picture.add(new Picture());

        // Відображення картини
        picture.draw();
    }
}