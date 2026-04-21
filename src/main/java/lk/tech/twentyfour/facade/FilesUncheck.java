package lk.tech.twentyfour.facade;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesUncheck {

    public static String readString(String pathString) {
        return uncheckedFoo(pathString, Files::readString);
    }

    public static List<String> readAllLines(String pathString) {
        return uncheckedFoo(pathString, Files::readAllLines);
    }

    public static <T> T uncheckedFoo(String pathString, FuncChecked<Path, T> supplier) {
        try {
            Path path = Path.of(pathString);
            return supplier.get(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FunctionalInterface
    public interface FuncChecked<T, R> {
        R get(T t) throws IOException;
    }

}
