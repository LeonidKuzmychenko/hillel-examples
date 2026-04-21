package lk.tech.twentyfive.bridge;

public class Main {
    public static void main(String[] args) {
        // Створення червоного прямокутника
        Shape redRectangle = new Rectangle(new RedColor());
        redRectangle.draw(); // Виклик методу для відображення прямокутника

        // Створення зеленого круга
        Shape greenCircle = new Circle(new GreenColor());
        greenCircle.draw(); // Виклик методу для відображення круга
    }
}