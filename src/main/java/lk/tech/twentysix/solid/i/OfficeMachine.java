package lk.tech.twentysix.solid.i;

/**
 * Interface Segregation Principle (Принцип розділення інтерфейсів)
 * Краще кілька вузьких інтерфейсів, ніж один великий
 * Рішення: Розбити інтерфейс на менші
 */
public interface OfficeMachine extends PrintMachine, ScanMachine, FaxMachine, CopyMachine{

}