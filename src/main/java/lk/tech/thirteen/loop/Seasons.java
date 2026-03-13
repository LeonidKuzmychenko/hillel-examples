package lk.tech.thirteen.loop;

public enum Seasons {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER;

    public static Seasons next(Seasons season) {
        return switch (season) {
            case SPRING -> SUMMER;
            case SUMMER -> AUTUMN;
            case AUTUMN -> WINTER;
            case WINTER -> SPRING;
        };
    }
}
