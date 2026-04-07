package lk.tech.twentyone.reflaction;

import lk.tech.twentyone.reflaction.dto.TestClass;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainReflectionMethod {

    public static void main(String[] args) throws Exception {
        TestClass obj = new TestClass();
        Class<?> aClass = Class.forName("lk.tech.twentyone.reflaction.dto.TestClass");


        Method print1 = aClass.getDeclaredMethod("print");
        print1.invoke(obj);

        Method print2 = aClass.getDeclaredMethod("print2");
        print2.invoke(null);

        Method print3 = aClass.getDeclaredMethod("print3");
        print3.setAccessible(true);
        print3.invoke(obj);

        Method print4 = aClass.getDeclaredMethod("print4", String.class);
        print4.setAccessible(true);
        print4.invoke(obj, "1234");

        System.out.println();
        System.out.println();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            if (Modifier.isPrivate(m.getModifiers())) {
                System.out.println(m);
            }
        }
    }
}