package lk.tech.twentysix.solid.d;

public class MainIOC {

    public static void main(String[] args) {
        UserRepository userRepository = new RedisUserRepository();
        UserService userService = new UserService(userRepository);
        userService.register("test@gmail.com");
    }
}
