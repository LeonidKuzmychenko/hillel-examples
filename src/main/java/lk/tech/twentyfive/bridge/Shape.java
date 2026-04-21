package lk.tech.twentyfive.bridge;

abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    // Конструктор абстракції, який приймає об'єкт реалізації
    public Shape(Color color) {
        this.color = color;
    }

    // Абстрактний метод для відображення фігури
    abstract void draw();
}