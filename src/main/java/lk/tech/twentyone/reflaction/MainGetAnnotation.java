package lk.tech.twentyone.reflaction;

import lk.tech.twentyone.annotations.MyCustomAnnotation;
import lk.tech.twentyone.reflaction.dto.TestClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainGetAnnotation {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        TestClass obj = new TestClass();


        //1
        Class<? extends TestClass> aClass1 = obj.getClass();

        //2
        Class<? extends TestClass> aClass2 = Thread.currentThread().getContextClassLoader()
                .loadClass("lk.tech.twentyone.reflaction.dto.TestClass")
                .asSubclass(TestClass.class);

        //3
        Class<TestClass> aClass3 = TestClass.class;

        //4
//        @SuppressWarnings("unchecked")
        Class<? extends TestClass> aClass4 = Class.forName("lk.tech.twentyone.reflaction.dto.TestClass").asSubclass(TestClass.class);

        System.out.println(aClass1);
        System.out.println(aClass2);
        System.out.println(aClass3);
        System.out.println(aClass4);

        MyCustomAnnotation annotation = aClass1.getAnnotation(MyCustomAnnotation.class);
        System.out.println("description: " + annotation.description());
        System.out.println("version: " + annotation.version());

        Class<? extends MyCustomAnnotation> annotationClass = annotation.getClass();
        Method descriptionMethod = annotationClass.getMethod("description");
        String description = (String)descriptionMethod.invoke(annotation);
        System.out.println("description: " + description);
    }
}