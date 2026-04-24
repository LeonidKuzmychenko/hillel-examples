package lk.tech.twentysix.solid.i;

/**
 * Interface Segregation Principle (Принцип розділення інтерфейсів)
 * Краще кілька вузьких інтерфейсів, ніж один великий
 * Рішення: Розбити інтерфейс на менші
 */
public interface OfficeMachine {

    void print(Document doc);

    void scan(Document doc);

    void fax(Document doc);

    void copy(Document doc);
}