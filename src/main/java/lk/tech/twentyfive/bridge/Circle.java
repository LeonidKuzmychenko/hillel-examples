package lk.tech.twentyfive.bridge;

class Circle extends Shape {
    // Конструктор круга, який приймає об'єкт реалізації кольору
    public Circle(Color color) {
        super(color);
    }

    // Перевизначення методу для відображення круга
    @Override
    void draw() {
        System.out.print("Відображення круга: ");
        color.applyColor(); // Виклик методу для застосування кольору
    }
}