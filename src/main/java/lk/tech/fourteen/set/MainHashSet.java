package lk.tech.fourteen.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
ТЗ:
Смоделювати систему реєстрації відвідувачів на конференції.

Вимоги:
1. Кожен відвідувач реєструється по email.
2. Один email може бути зареєстрований тільки один раз (унікальність).
3. Потрібно показати:
   - додавання відвідувачів
   - спробу додати дубль
   - перевірку наявності email
   - перебір всіх зареєстрованих
   - видалення відвідувача
   - кількість зареєстрованих
*/

public class MainHashSet {

    public static void main(String[] args) {

        // створюємо HashSet для зберігання email
        LinkedHashSet<String> registeredEmails = new LinkedHashSet<>();

        System.out.println("Conference registration started");

        // реєструємо відвідувачів
        registeredEmails.add("anna@mail.com");
        registeredEmails.add("oleg@mail.com");
        registeredEmails.add("maria@mail.com");

        System.out.println("Registered users: " + registeredEmails);

        // пробуємо зареєструвати дубль
        boolean added = registeredEmails.add("anna@mail.com");

        System.out.println("Trying to register anna@mail.com again");
        System.out.println("Was registration successful: " + added);

        // перевіряємо чи є такий email
        boolean exists = registeredEmails.contains("maria@mail.com");
        System.out.println("Is maria@mail.com registered: " + exists);

        // кількість зареєстрованих
        System.out.println("Total registered users: " + registeredEmails.size());

        // перебираємо всіх відвідувачів
        System.out.println("All registered emails:");

        for (String email : registeredEmails) {
            System.out.println(email);
        }

        // видаляємо одного відвідувача
        registeredEmails.remove("oleg@mail.com");

        System.out.println("After removing oleg@mail.com: " + registeredEmails);

        // очищаємо реєстрацію
        registeredEmails.clear();

        System.out.println("After clearing registration: " + registeredEmails);
    }
}