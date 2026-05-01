package lk.tech.twentysix.grasp.indirection;

import lk.tech.twentysix.solid.d.UserRepository;
import lk.tech.twentysix.solid.d.UserService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Indirection (Посередник)
 * Додати проміжний шар для зменшення залежностей
 * Погано: UI напряму працює з БД
 * Рішення: Додати service/repository layer
 */
public class UserController {

    public void createUser(String name, String email) {
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

            System.out.println("Користувача створено");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}