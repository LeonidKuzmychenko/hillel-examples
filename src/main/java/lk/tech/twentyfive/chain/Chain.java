package lk.tech.twentyfive.chain;

public abstract class Chain {

    protected Chain nextChain;

    public abstract String validate(String password);

    public boolean hasNext() {
        return nextChain != null;
    }

    public Chain getNext() {
        return nextChain;
    }

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }
}
