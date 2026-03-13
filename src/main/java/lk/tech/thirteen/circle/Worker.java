package lk.tech.thirteen.circle;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Worker implements Runnable {

    private final CyclicBarrier cb;
    private final List<Person> people;

    Worker(List<Person> people, CyclicBarrier cb) {
        this.people = people;
        this.cb = cb;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " починає впускати людей");

        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " пропускає нову людину");
            people.add(new Person());
        }

        try {
            System.out.println("await.. " + Thread.currentThread().getName());
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
            return;
        }

        if (Thread.currentThread().getName().equals("Manager0")) {
            System.out.println(Thread.currentThread().getName() + " роздає Футболка");
            for (Person person : people) {
                person.addEquipment("Футболка");
            }
        }

        if (Thread.currentThread().getName().equals("Manager1")) {
            System.out.println(Thread.currentThread().getName() + " роздає Запальничка");
            for (Person person : people) {
                person.addEquipment("Запальничка");
            }
        }

        if (Thread.currentThread().getName().equals("Manager2")) {
            System.out.println(Thread.currentThread().getName() + " роздає Плакат");
            for (Person person : people) {
                person.addEquipment("Плакат");
            }
        }

        try {
            System.out.println("await.. " + Thread.currentThread().getName());
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
        }



    }
}