package lk.tech.seventeen.task.model;

import java.util.List;

public class Train {

    private List<Section> sections;

    public Train(List<Section> sections) {
        this.sections = sections;
    }

    public List<Section> getSections() {
        return sections;
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
