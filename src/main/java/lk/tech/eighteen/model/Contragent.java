package lk.tech.eighteen.model;

public class Contragent {

    private Profile profile;

    public Contragent(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "Contragent{" +
                "profile=" + profile +
                '}';
    }
}
