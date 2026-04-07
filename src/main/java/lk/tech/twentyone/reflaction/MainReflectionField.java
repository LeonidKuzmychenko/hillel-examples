package lk.tech.twentyone.reflaction;

import lk.tech.twentyone.reflaction.dto.TestClass;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class MainReflectionField {

    public static void main(String[] args) throws Exception {
        TestClass obj = new TestClass();

        System.out.println("Before: " + obj);

        // 1. private
        Field f1 = obj.getClass().getDeclaredField("privateField");
        f1.setAccessible(true);
        f1.set(obj, 100);

        // 2. private final
        Field f2 = TestClass.class.getDeclaredField("privateFinalField");
        f2.setAccessible(true);
        f2.set(obj, 200);

        // 3. private static
        Field f3 = TestClass.class.getDeclaredField("privateStaticField");
        f3.setAccessible(true);
        f3.set(null, 300);

        // 4. private static final (через Unsafe)
        //Settings → Build, Execution, Deployment → Compiler → Java Compiler
        //Additional command line parameters
        //Unrecognized option: -Xlint:-deprecation
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        Field f4 = TestClass.class.getDeclaredField("privateStaticFinalField");
        f4.setAccessible(true);
        Object base = unsafe.staticFieldBase(f4);
        long offset = unsafe.staticFieldOffset(f4);
        unsafe.putObject(base, offset, 400);


//        Field f4 = TestClass.class.getDeclaredField("privateStaticFinalField");
//        f4.setAccessible(true);
//        f4.set(null, 400);

        System.out.println("After new instance: " + new TestClass());
        System.out.println("After same object: " + obj);
    }
}