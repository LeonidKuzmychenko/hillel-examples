package lk.tech.twentysix.solid.s;

/**
 * Single Responsibility Principle (Принцип єдиної відповідальності)
 * Рішення: Розділити відповідальності на окремі класи
 */
public class UserService {

    public void registerUser(String email, String password) {
        // 1. Валідація
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Weak password");
        }

        // 2. Бізнес-логіка
        String hashedPassword = hashPassword(password);

        // 3. Робота с БД
        saveToDatabase(email, hashedPassword);

        // 4. Логування
        System.out.println("User registered: " + email);

        // 5. Відправка email
        sendWelcomeEmail(email);
    }

    private String hashPassword(String password) {
        return "hashed_" + password;
    }

    private void saveToDatabase(String email, String password) {
        // JDBC / ORM код
    }

    private void sendWelcomeEmail(String email) {
        // SMTP логіка
    }
}