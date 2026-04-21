package lk.tech.twentyfour.clone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Roof {

    private String material;

    @Override
    public Roof clone(){
        return new Roof(material);
    }
}
