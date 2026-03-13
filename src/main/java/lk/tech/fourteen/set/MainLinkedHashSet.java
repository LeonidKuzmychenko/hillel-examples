package lk.tech.fourteen.set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
ТЗ:
Смоделювати список гостей, які першими зареєструвались на подію.

Вимоги:
1. Кожен гість реєструється за email.
2. Email мають бути унікальними (дублі не допускаються).
3. Порядок реєстрації має зберігатися.
4. Потрібно показати:
   - додавання гостей
   - спробу додати дубль
   - перевірку наявності email
   - перебір гостей у порядку реєстрації
   - видалення гостя
   - кількість гостей
*/

public class MainLinkedHashSet {

    public static void main(String[] args) {

        // створюємо LinkedHashSet для зберігання email
        Set<String> guests = new LinkedHashSet<>();

        System.out.println("Guest registration started");

        // додаємо гостей
        guests.add("anna@mail.com");
        guests.add("oleg@mail.com");
        guests.add("maria@mail.com");

        System.out.println("Guests after registration: " + guests);

        // пробуємо додати дубль
        boolean added = guests.add("anna@mail.com");

        System.out.println("Trying to add duplicate anna@mail.com");
        System.out.println("Was the element added: " + added);

        // перевіряємо наявність гостя
        boolean exists = guests.contains("maria@mail.com");
        System.out.println("Is maria@mail.com registered: " + exists);

        // кількість гостей
        System.out.println("Total guests: " + guests.size());

        // перебір у порядку реєстрації
        System.out.println("Guests in registration order:");

        for (String email : guests) {
            System.out.println(email);
        }

        // видаляємо гостя
        guests.remove("oleg@mail.com");

        System.out.println("After removing oleg@mail.com: " + guests);

        // очищаємо список
        guests.clear();

        System.out.println("After clearing guest list: " + guests);
    }
}