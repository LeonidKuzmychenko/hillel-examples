package lk.tech.seventeen.task;

import lk.tech.seventeen.task.model.Person;
import lk.tech.seventeen.task.model.Section;
import lk.tech.seventeen.task.model.Train;

import java.util.*;
import java.util.stream.Collectors;

public class MainTrain {

    public static void main(String[] args) {

        List<Person> peopleSection1 = List.of(
                new Person("female", "Lviv", true),
                new Person("male", "Odesa", false)
        );

        List<Person> peopleSection2 = List.of(
                new Person("female", "Kyiv", false),
                new Person("male", "Odesa", true)
        );

        List<Person> peopleSection3 = List.of(
                new Person("female", "Harkiv", true),
                new Person("male", "Harkiv", true)
        );


        List<Section> sections = List.of(
                new Section(peopleSection1),
                new Section(peopleSection2),
                new Section(peopleSection3)
        );

        Train train = new Train(sections);


        Map<String, Integer> collect = train.getSections()
                .stream()
                .map(Section::getPeople)
                .parallel()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(
                        it -> it.getDestination(), Collectors.collectingAndThen(
                                Collectors.counting(), count->Math.toIntExact(count))));


        System.out.println(collect);


//        System.out.println(getAllPeople(train));
//        System.out.println(filteredPersonByGreenTicket);
    }

    public static List<Person> getAllPeople(Train train) {
        List<Person> allPeople = new ArrayList<>();
        List<Section> sections = train.getSections();
        for (Section section : sections) {
            List<Person> peopleBySection = section.getPeople();
            allPeople.addAll(peopleBySection);
        }
        return allPeople;
    }

    /**
     * формувати мапу, де ключ це назва місця призначення
     * значення це список пасажирів із цим місцев призначення
     * @param people
     */
    public static Map<String, List<Person>> getDestinationPeopleListMap(List<Person> people) {
        Map<String, List<Person>>  destinationPeopleListMap = new HashMap<>();
        for (Person person : people) {
            String destination = person.getDestination();
            if (destinationPeopleListMap.containsKey(destination)) {
                destinationPeopleListMap.get(destination).add(person);
            }
            else {
                List<Person> personList = new ArrayList<>();
                personList.add(person);
                destinationPeopleListMap.put(destination, personList);
            }
        }
        return destinationPeopleListMap;
    }
}
