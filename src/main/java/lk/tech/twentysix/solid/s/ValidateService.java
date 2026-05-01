package lk.tech.twentysix.solid.s;

public class ValidateService {

    public void validatePassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Weak password");
        }
    }

    public void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}
