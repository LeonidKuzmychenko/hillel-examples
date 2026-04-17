package lk.tech.twentyfoure.facade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainFacade {

    public static void main(String[] args) {
        String s = FilesUncheck.readString("src/main/resources/files/text.txt");
        System.out.println(s);
    }
}
