package lk.tech.twentyfour.singleton;


public class DataBaseService {

//    private static final Object LOCK = new Object();
//    private static volatile DataBaseService INSTANCE;
//
//    public static DataBaseService getInstance() {
//        if (INSTANCE == null) {
//            synchronized (LOCK) {
//                if (INSTANCE == null) {
//                    INSTANCE = new DataBaseService();
//                }
//            }
//        }
//        //1. allow
//        //3. INSTANCE - ref
//        //2. constructor
//
//        return INSTANCE;
//    }

    //eager
//    public static final DataBaseService INSTANCE = new DataBaseService();

    //lazy
    public static class Holder {
        private static final DataBaseService INSTANCE = new DataBaseService();
    }

    public static DataBaseService getInstance() {
        return Holder.INSTANCE;
    }

    public DataBaseService() {
        connect();
    }

    private void connect() {
        System.out.println("connect to DB");
    }

    public Object read() {
        return null;
    }

    public void write(Object object) {

    }
}
