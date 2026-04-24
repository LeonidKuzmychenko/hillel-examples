package lk.tech.twentysix.grasp.lowcoupling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Low Coupling (Низька зв’язаність)
 * Класи повинні мінімально залежати один від одного
 * Прямі залежності на багато конкретних класів
 * Використати інтерфейси, DI
 */
public class OrderService {

    private EmailService emailService = new EmailService();
    private SmsService smsService = new SmsService();
    private PdfGenerator pdfGenerator = new PdfGenerator();
    private DiscountCalculator discountCalculator = new DiscountCalculator();
    private LoggerService loggerService = new LoggerService();

    public void createOrder(String customerEmail, String phone, double amount) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/shop",
                "user",
                "password"
            );

            PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO orders(amount) VALUES (?)"
            );

            statement.setDouble(1, amount);
            statement.executeUpdate();

            double finalAmount = discountCalculator.applyDiscount(amount);

            pdfGenerator.generateInvoice(finalAmount);

            emailService.send(customerEmail);

            smsService.send(phone);

            loggerService.log("Замовлення створено");

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}