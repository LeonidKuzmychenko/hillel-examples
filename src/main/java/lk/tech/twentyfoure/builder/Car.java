package lk.tech.twentyfoure.builder;

import lombok.*;

@Getter
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Car {

    private String model;
    private String color;
    private Integer year;
    private Integer price;

}
