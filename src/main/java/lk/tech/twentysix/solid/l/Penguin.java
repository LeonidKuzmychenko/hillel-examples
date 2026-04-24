package lk.tech.twentysix.solid.l;

class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}