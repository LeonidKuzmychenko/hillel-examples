package lk.tech.twentyone.annotations;

import lk.tech.twentyone.UserRecord;

public class MainRecord {

    public static void main(String[] args) {
        UserRecord userRecord = new UserRecord(5, "","");

        Class<? extends UserRecord> clazz1 = userRecord.getClass();
        Class<UserRecord> clazz2 = UserRecord.class;

    }
}
