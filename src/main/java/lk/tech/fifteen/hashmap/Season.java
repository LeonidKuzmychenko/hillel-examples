package lk.tech.fifteen.hashmap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public enum Season {

    SPRING, SUMMER, AUTUMN, WINTER;


    //v1
//    public static Season next(Season season) {
//        if (season == SPRING) {
//            return SUMMER;
//        }
//
//        if (season == SUMMER) {
//            return AUTUMN;
//        }
//
//        if (season == AUTUMN) {
//            return WINTER;
//        }
//
//        if (season == WINTER) {
//            return SPRING;
//        }
//
//        return SPRING;
//    }

    //2
//    public static Season next(Season season) {
//        switch (season){
//            case SPRING: return SUMMER;
//            case SUMMER: return AUTUMN;
//            case AUTUMN: return WINTER;
//            case WINTER: return SPRING;
//            default: return null;
//        }
//    }

    //3
//    public static Season next(Season season) {
//        return switch (season) {
//            case SPRING -> SUMMER;
//            case SUMMER -> AUTUMN;
//            case AUTUMN -> WINTER;
//            case WINTER -> SPRING;
//        };
//    }

    public static final Map<Season, Season> map = new EnumMap<>(Season.class);

    static {
        map.put(SPRING, SUMMER);
        map.put(SUMMER, AUTUMN);
        map.put(AUTUMN, WINTER);
        map.put(WINTER, SPRING);
    }

    //4
    public static Season next(Season season) {
        return map.get(season);
    }


}
