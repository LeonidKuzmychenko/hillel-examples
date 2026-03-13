package lk.tech.thirteen.circle;

import java.util.List;

// Дія бар'єру, яка має виконуватися
// при спрацьовуванні бар'єру
class BarrierAction implements Runnable {

    private final List<Person> people;

    BarrierAction(List<Person> people){
        this.people = people;
    }

    @Override
    public void run() {
        System.out.println(people);
    }
}