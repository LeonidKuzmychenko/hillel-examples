package lk.tech.twentyfive.chain.validatechain;

import lk.tech.twentyfive.chain.Chain;

public class PasswordValidationLengthChain extends Chain {
    @Override
    public String validate(String password) {
        password = password + "Q";
        if (password.length() < 12){
            throw new IllegalArgumentException("Password length should be greater than 12 characters");
        }
        if (hasNext()){
            return getNext().validate(password);
        }
        return password;
    }
}
