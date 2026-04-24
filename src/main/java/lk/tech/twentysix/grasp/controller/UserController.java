package lk.tech.twentysix.grasp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Controller (Контролер)
 * Окремий клас приймає зовнішні запити та координує виконання
 * Залишити координацію, логіку винести в service
 */
public class UserController {

    public void registerUser(String name, String email) {
        try {
            // Валідація прямо в контролері
            if (name == null || name.isBlank()) {
                throw new RuntimeException("Ім'я порожнє");
            }

            if (!email.contains("@")) {
                throw new RuntimeException("Некоректний email");
            }

            // Бізнес-логіка прямо в контролері
            System.out.println("Створення користувача: " + name);

            // Робота з БД прямо в контролері
            Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/app",
                "user",
                "password"
            );

            PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO users(name, email) VALUES (?, ?)"
            );

            statement.setString(1, name);
            statement.setString(2, email);
            statement.executeUpdate();

            statement.close();
            connection.close();

            // Відправка повідомлення прямо в контролері
            System.out.println("Email відправлено на " + email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}