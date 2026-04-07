package lk.tech.twentyone.reflaction.dto;

import lk.tech.twentyone.annotations.MyCustomAnnotation;

@MyCustomAnnotation(description = "TestClass", version = 2)
public class TestClass {

    private Integer privateField = 1;

    private final Integer privateFinalField = 2;

    private static Integer privateStaticField = 3;

    private static final Integer privateStaticFinalField = 4;


    public void print(){
        System.out.println("public void print");
    }

    public static void print2(){
        System.out.println("public static void print2");
    }

    private static void print3(){
        System.out.println("private static void print3");
    }

    private static void print4(String text){
        System.out.println("private static void print4: " + text);
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "privateField=" + privateField +
                ", privateFinalField=" + privateFinalField +
                ", privateStaticField=" + privateStaticField +
                ", privateStaticFinalField=" + privateStaticFinalField +
                '}';
    }
}