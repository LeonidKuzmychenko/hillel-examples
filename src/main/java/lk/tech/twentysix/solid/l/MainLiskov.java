package lk.tech.twentysix.solid.l;

/**
 * Liskov Substitution Principle (Принцип підстановки Лісков)
 * Об’єкти дочірнього класу повинні коректно замінювати батьківський
 * Наслідник змінює поведінку або кидає винятки там, де базовий клас цього не робить
 * Рішення: Переглянути спадкування, інколи замінити композицією
 */
public class MainLiskov {

    public static void main(String[] args) {
        FlyingBird bird = new FlyingBird();
        new BirdService().makeBirdFly(bird);
    }
}
