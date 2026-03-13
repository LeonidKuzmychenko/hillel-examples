package lk.tech.fourteen.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Function;

/*
ТЗ:
Смоделювати систему обробки пацієнтів у лікарні.

Вимоги:
1. Пацієнти мають різний рівень терміновості.
2. Чим менше число — тим більш терміновий пацієнт.
3. Пацієнти повинні обслуговуватись не за порядком приходу,
   а за рівнем терміновості.
4. Потрібно показати:
   - додавання пацієнтів
   - автоматичне сортування у PriorityQueue
   - перегляд наступного пацієнта
   - обробку пацієнтів
*/

public class MainPriorityQueue {

    public static void main(String[] args) {

        // створюємо PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        System.out.println("Hospital queue created");

        // додаємо пацієнтів з різною терміновістю
        queue.offer(3); // середній стан
        queue.offer(1); // критичний стан
        queue.offer(2); // важкий стан
        queue.offer(5); // легкий стан

        System.out.println("Patients added with priority levels: " + queue);

        // дивимось хто буде наступний
        System.out.println("Next patient priority: " + queue.peek());



        System.out.println("\nProcessing patients:");

        // обробляємо пацієнтів
        while (!queue.isEmpty()) {
            Integer priority = queue.poll();
            System.out.println("Treating patient with priority: " + priority);
        }

        System.out.println("Patients added with priority levels: " + queue);

        System.out.println("\nAll patients processed");
    }
}