package lk.tech.twentysix.solid.d;

public class MainIOC {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.register("test@gmail.com");
    }
}
