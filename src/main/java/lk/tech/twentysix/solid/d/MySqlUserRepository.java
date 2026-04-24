package lk.tech.twentysix.solid.d;

public class MySqlUserRepository implements UserRepository {

    public void save(String email) {
        System.out.println("saved to mysql");
    }
}