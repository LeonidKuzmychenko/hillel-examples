package lk.tech.seventeen.task.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Train {

    private List<Section> sections;

    public Train(List<Section> sections) {
        this.sections = sections;
    }

    public List<Section> getSections() {
        this.sections = Optional.ofNullable(sections).orElse(Collections.emptyList());
        return this.sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Train{" +
                "sections=" + sections +
                '}';
    }
}
