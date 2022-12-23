package entitiesOfClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Record extends Entity {


    private Constructor constructor ;
    // name Getters
    private List<Method> methods = new ArrayList<>();

    public Record(String name) {
        super(name);
    }

    @Override
    public void show() {

    }

//     GETTERS
}
