package lk.tech.twentyfour.singleton;

public class MainSingleton {

    public static void main(String[] args) {
//        DataBaseService instance1 = DataBaseService.getInstance();
//        DataBaseService instance2 = DataBaseService.getInstance();
//
//        System.out.println(instance1 == instance2);
//        System.out.println("some work");

//        System.out.println("Hello World");

        DataBaseService baseService = DataBaseEnumService.INSTANCE.getDataBaseService();
    }
}
