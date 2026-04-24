package lk.tech.twentysix.solid.i;

public class SimplePrinter implements OfficeMachine {

    @Override
    public void print(Document doc) {
        System.out.println("Printing...");
    }
}