package lk.tech.twentysix.grasp.purefabrication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Pure Fabrication (Штучний клас)
 * Іноді створюють окремий технічний клас, щоб покращити архітектуру
 * Погано: Пхати технічну логіку в доменні класи
 * Рішення: Створити окремий сервіс/репозиторій
 */
public class User {

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase() {
        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendWelcomeEmail() {
        System.out.println("Email відправлено на: " + email);
    }

    public void generatePdfReport() {
        System.out.println("PDF звіт користувача створено");
    }
}