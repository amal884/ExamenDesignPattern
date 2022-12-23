package entitiesOfClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Annotation extends  Entity {

    private List<String> properties = new ArrayList<>();

    public Annotation(String name) {
        super(name);
    }

    @Override
    public void show() {

    }


    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }
}
