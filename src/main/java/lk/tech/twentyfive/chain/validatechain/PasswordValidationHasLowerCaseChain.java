package lk.tech.twentyfive.chain.validatechain;

import lk.tech.twentyfive.chain.Chain;

public class PasswordValidationHasLowerCaseChain extends Chain {
    @Override
    public String validate(String password) {
        password = password + "L";
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return hasNext() ? getNext().validate(password) : password;
            }
        }
        throw new IllegalArgumentException("Password not contains lowercase characters");
    }
}
