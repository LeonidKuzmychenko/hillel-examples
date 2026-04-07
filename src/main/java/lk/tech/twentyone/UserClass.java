package lk.tech.twentyone;

import java.util.Objects;

public class UserClass {
    private long id;
    private String firstName;
    private String lastName;

    public UserClass(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserClass userClass = (UserClass) o;
        return getId() == userClass.getId() && Objects.equals(getFirstName(), userClass.getFirstName()) && Objects.equals(getLastName(), userClass.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName());
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
