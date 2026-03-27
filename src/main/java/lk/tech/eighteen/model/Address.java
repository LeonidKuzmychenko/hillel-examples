package lk.tech.eighteen.model;

public class Address {

    private City city;

    public Address(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                '}';
    }
}
