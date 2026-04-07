package lk.tech.twentyone;

import lk.tech.twentyone.annotations.MyCustomAnnotation;

@MyCustomAnnotation(description = "324")
public record UserRecord(long id, String firstName, String lastName) {

}