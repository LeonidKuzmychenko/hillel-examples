package lk.tech.seventeen.task.model;

public class Person {

    private String gender;
    private String destination;
    private boolean greenTicket;

    public Person(String gender, String destination, boolean greenTicket) {
        this.gender = gender;
        this.destination = destination;
        this.greenTicket = greenTicket;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isGreenTicket() {
        return greenTicket;
    }

    public void setGreenTicket(boolean greenTicket) {
        this.greenTicket = greenTicket;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", destination='" + destination + '\'' +
                ", greenTicket=" + greenTicket +
                '}';
    }
}
