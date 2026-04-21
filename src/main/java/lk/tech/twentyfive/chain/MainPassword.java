package lk.tech.twentyfive.chain;

import lk.tech.twentyfive.chain.validatechain.PasswordValidationHasLowerCaseChain;
import lk.tech.twentyfive.chain.validatechain.PasswordValidationHasUpperCaseChain;
import lk.tech.twentyfive.chain.validatechain.PasswordValidationLengthChain;

public class MainPassword {

    public static void main(String[] args) {
        String password = "MySecure@123";

        var pvlc = new PasswordValidationLengthChain();
        var pvhucc = new PasswordValidationHasUpperCaseChain();
        var pvhlcc = new PasswordValidationHasLowerCaseChain();

        pvlc.setNextChain(pvhucc);
        pvhucc.setNextChain(pvhlcc);

        try {
            String validate = pvlc.validate(password);
            System.out.println("VALID: " + validate);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("INVALID");
        }


//        try {
//            validateLength(password);
//            hasUpperCase(password);
//            hasLowerCase(password);
//            hasDigit(password);
//            validateSpecialChar(password);
//            System.out.println("VALID");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("INVALID");
//        }

    }

    public static void validateLength(String password) {
        if (password.length() < 12){
            throw new IllegalArgumentException("Password length should be greater than 12 characters");
        }
    }


    public static void hasUpperCase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password not contains uppercase characters");
    }

    public static void hasLowerCase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password not contains lowercase characters");
    }

    public static void hasDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return;
            }
        }
        throw new IllegalArgumentException("Password not contains digit characters");
    }

    public static void validateSpecialChar(String password) {
        String specialChars = "!@#$%^&*";
        for (char ch : password.toCharArray()) {
            if (specialChars.indexOf(ch) >= 0) {
                return;
            }
        }
        throw new IllegalArgumentException("Password not contains special characters");
    }
}