package lk.tech.seventeen.task.model;

import java.util.List;

public class Section {

    private List<Person> people;

    public Section(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Section{" +
                "people=" + people +
                '}';
    }
}
