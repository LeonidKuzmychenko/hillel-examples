package lk.tech.twentyfive.adapter;

import lk.tech.twentyfive.adapter.old.OldClass;
import lk.tech.twentyfive.adapter.old.OldInterface;

public class MainAdapter {

    public static void main(String[] args) {
        OldInterface old = new OldToNewAdapter(new NewClass());
//        OldInterface old = new OldClass();
        callOldClassMethod(old);
    }

    public static void callOldClassMethod(OldInterface old){
        old.specificRequest();
    }
}