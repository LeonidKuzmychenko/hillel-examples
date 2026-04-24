package lk.tech.twentysix.grasp.highcohesion;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * High Cohesion (Висока зв’язність)
 * Клас має містити споріднену логіку, а не все підряд
 * Розділити на спеціалізовані класи
 */
public class EmployeeManager {

    public void addEmployee(String name) {
        System.out.println("Працівник доданий: " + name);
    }

    public void calculateSalary(String name, double hours) {
        double salary = hours * 15.5;
        System.out.println("Зарплата для " + name + ": " + salary);
    }

    public void sendEmail(String email) {
        System.out.println("Відправлено email на: " + email);
    }

    public void generatePdfReport() {
        System.out.println("PDF звіт створено");
    }

    public void saveToDatabase() {
        System.out.println("Дані збережено в БД");
    }

    public void writeLog(String message) {
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(LocalDateTime.now() + " : " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}