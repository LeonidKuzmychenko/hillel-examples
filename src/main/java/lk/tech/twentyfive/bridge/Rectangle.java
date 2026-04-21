package lk.tech.twentyfive.bridge;

class Rectangle extends Shape {
    // Конструктор прямокутника, який приймає об'єкт реалізації кольору
    public Rectangle(Color color) {
        super(color);
    }

    // Перевизначення методу для відображення прямокутника
    @Override
    void draw() {
        System.out.print("Відображення прямокутника: ");
        color.applyColor(); // Виклик методу для застосування кольору
    }
}