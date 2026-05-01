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

//    private EmailService emailService;
//    private SmsService smsService ;
//    private PdfGenerator pdfGenerator;
//    private DiscountCalculator discountCalculator;
//    private LoggerService loggerService;
//
//    public OrderService(EmailService emailService,
//                        SmsService smsService,
//                        PdfGenerator pdfGenerator,
//                        DiscountCalculator discountCalculator,
//                        LoggerService loggerService) {
//        this.emailService = emailService;
//        this.smsService = smsService;
//        this.pdfGenerator = pdfGenerator;
//        this.discountCalculator = discountCalculator;
//        this.loggerService = loggerService;
//    }
}