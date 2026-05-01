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

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registerUser(String name, String email) {
        try {
            userService.registerUser(name, email);
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}