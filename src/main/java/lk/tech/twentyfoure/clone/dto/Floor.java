package lk.tech.twentyfoure.clone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Floor {

    private String material;

    @Override
    public Floor clone(){
        return new Floor(material);
    }
}
