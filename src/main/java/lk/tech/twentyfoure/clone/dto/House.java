package lk.tech.twentyfoure.clone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class House {

    private Roof roof;
    private List<Wall> walls;
    private Floor floor;

    @Override
    public House clone() {
        List<Wall> walls = this.walls.stream().map(Wall::clone).toList();
        return new House(this.roof.clone(), walls, this.floor.clone());
    }
}
