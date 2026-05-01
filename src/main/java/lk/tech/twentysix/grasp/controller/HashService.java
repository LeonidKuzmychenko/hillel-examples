package lk.tech.twentysix.grasp.controller;

public class HashService {

    public String hashPassword(String password) {
        return "hashed_" + password;
    }
}
