package lk.tech.twentysix.solid.d;

/***
 * Dependency Inversion Principle (Принцип інверсії залежностей)
 * Залежати треба від абстракцій, а не від конкретних класів
 * Використати інтерфейси та Dependency Injection
 */
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String email) {
        repository.save(email);
    }
}