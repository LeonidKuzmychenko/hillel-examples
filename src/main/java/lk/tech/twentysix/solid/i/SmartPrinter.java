package lk.tech.twentysix.solid.i;

public class SmartPrinter implements OfficeMachine {

    @Override
    public void print(Document doc) {
        System.out.println("Printing...");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scan...");
    }

    @Override
    public void fax(Document doc) {
        System.out.println("Fax...");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copy...");
    }
}