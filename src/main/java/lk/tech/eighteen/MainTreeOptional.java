package lk.tech.eighteen;

import lk.tech.eighteen.model.*;

import java.util.Optional;
import java.util.function.Supplier;

public class MainTreeOptional {

    //controller
    public static void main(String[] args) {
//        City city = new City("Odesa");
//        Address address = new Address(city);
//        Profile profile = new Profile(address);
//        Contragent contragent = new Contragent(profile);
//        Response response = new Response(contragent);
//
//        Optional<String> cityName = getCityNameNotCityName(response, "Kyiv");
//
//        cityName.ifPresentOrElse(System.out::println, () -> System.out.println("City name is empty"));

        Optional<String> userName = Optional.empty();
        String result = userName.orElseThrow(()->new RuntimeException("Username is empty"));
        System.out.println(result);
    }

    public static Optional<String> getCityNameNotCityName(Response response, String cityName) {
        return Optional.ofNullable(response)//Optional<Response>
                .map(Response::getContragent)//Optional<Contragent>
                .map(Contragent::getProfile)
                .map(Profile::getAddress)
                .map(Address::getCity)
                .map(City::getName)
                .filter(name -> !name.equals(cityName));
    }

}
