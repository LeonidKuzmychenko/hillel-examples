package lk.tech.eighteen.model;

public class Response {
    private Contragent contragent;

    public Response(Contragent contragent) {
        this.contragent = contragent;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }

    @Override
    public String toString() {
        return "Response{" +
                "contragent=" + contragent +
                '}';
    }
}
