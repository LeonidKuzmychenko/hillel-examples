package lk.tech.twentysix.grasp.controller;

import lombok.RequiredArgsConstructor;

/**
 * Single Responsibility Principle (Принцип єдиної відповідальності)
 * Рішення: Розділити відповідальності на окремі класи
 */
@RequiredArgsConstructor
public class UserService {

    private final ValidateService validateService;
    private final HashService hashService;
    private final UserRepository userRepository;
    private final EmailService emailService;

    public void registerUser(String email, String password) {
        // 1. Валідація
        validateService.validateEmail(email);
        validateService.validatePassword(password);

        // 2. Бізнес-логіка
        String hashedPassword = hashService.hashPassword(password);

        // 3. Робота с БД
        userRepository.saveToDatabase(email, hashedPassword);

        // 4. Логування
        System.out.println("User registered: " + email);

        // 5. Відправка email
        emailService.sendWelcomeEmail(email);
    }
}