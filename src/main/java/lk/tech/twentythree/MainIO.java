package lk.tech.twentythree;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MainIO {

    public static void main(String[] args) throws IOException {
        String s = IOUtils.resourceToString("/files/text.txt", StandardCharsets.UTF_8);
        System.out.println(s);
    }

    public String readFileFromResources(String fileName) throws IOException {
        try (InputStream inputStream = MainIO.class.getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream != null) {
                return IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            }
            throw new IOException(fileName);
        }
    }
}
