package lk.tech.twentyfour.clone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wall {

    private String material;

    @Override
    public Wall clone(){
        return new Wall(material);
    }
}
