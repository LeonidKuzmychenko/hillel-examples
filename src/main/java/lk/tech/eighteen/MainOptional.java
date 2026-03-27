package lk.tech.eighteen;

import java.util.Optional;

public class MainOptional {

    public static void main(String[] args) {
        Optional<Object> optional = Optional.ofNullable(null);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("obj is empty");
        }

        if (optional.isEmpty()) {
            System.out.println("obj is empty");
        } else {
            System.out.println(optional.get());
        }

    }

    public static String checkStatus(String status) {
        if (status == null) {
            return "UNKNOWN";
        }
        return status;
    }

    public static String checkStatusV2(String status) {
        return Optional.ofNullable(status).orElse("UNKNOWN");
    }
}
