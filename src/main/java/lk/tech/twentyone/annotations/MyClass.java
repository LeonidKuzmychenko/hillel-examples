package lk.tech.twentyone.annotations;

import java.util.ArrayList;
import java.util.List;

@MyCustomAnnotation(description = "TYPE")
public class MyClass {

    @MyCustomAnnotation(description = "FIELD")
    private static final String ANY = "";

    @MyCustomAnnotation(description = "CONSTRUCTOR")
    public MyClass() {
    }

    @MyCustomAnnotation(description = "METHOD")
    public static void main(@MyCustomAnnotation(description = "PARAMETER") String[] args) {

        List<@MyCustomAnnotation(description = "LOCAL_VARIABLE") String> list = new ArrayList<String>();
        @MyCustomAnnotation(description = "LOCAL_VARIABLE")
        var a = 5;
        System.out.println("Hello World");
    }
}