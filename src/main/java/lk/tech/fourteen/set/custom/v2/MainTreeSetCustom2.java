package lk.tech.fourteen.set.custom.v2;

import java.util.Comparator;
import java.util.TreeSet;

/*
ТЗ:
Смоделювати систему зберігання співробітників у компанії.

Вимоги:
1. Кожен співробітник має:
   - id
   - ім'я
   - зарплату
2. Співробітники повинні зберігатися у відсортованому порядку за зарплатою.
3. Якщо зарплати однакові — сортувати за id.
4. Потрібно показати:
   - додавання співробітників
   - автоматичне сортування DTO
   - перебір TreeSet
*/

public class MainTreeSetCustom2 {

    public static void main(String[] args) {

        // спочатку по зарплаті
        // якщо зарплати однакові — по id
        TreeSet<EmployeeDTO> employees = new TreeSet<>(
                Comparator.comparingInt((EmployeeDTO o) -> o.salary).thenComparingInt(o -> o.id)
        );

        // додаємо співробітників
        employees.add(new EmployeeDTO(3, "Anna", 2500));
        employees.add(new EmployeeDTO(1, "Oleg", 3200));
        employees.add(new EmployeeDTO(2, "Maria", 2500));
        employees.add(new EmployeeDTO(4, "Ivan", 1800));

        System.out.println("Employees sorted by salary:");

        for (EmployeeDTO e : employees) {
            System.out.println(e);
        }
    }
}