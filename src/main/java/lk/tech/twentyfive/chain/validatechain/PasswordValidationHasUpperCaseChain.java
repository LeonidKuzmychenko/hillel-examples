package lk.tech.twentyfive.chain.validatechain;

import lk.tech.twentyfive.chain.Chain;

public class PasswordValidationHasUpperCaseChain extends Chain {
    @Override
    public String validate(String password) {
        password = password + "U";
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return hasNext() ? getNext().validate(password) : password;
            }
        }
        throw new IllegalArgumentException("Password not contains uppercase characters");
    }
}
