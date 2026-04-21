package lk.tech.twentyfour.facade;

public class MainFacade {

    public static void main(String[] args) {
        String s = FilesUncheck.readString("src/main/resources/files/text.txt");
        System.out.println(s);
    }
}
