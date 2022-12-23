import entitiesOfClassDiagram.Entity;
import relationOfClassDiagram.Relation;

import java.util.List;

public class AdapterImplGenerator extends AncienneGenerer implements IGenererStrategy {

    @Override
    public void genererCodeSource(List<Entity> entities, List<Relation> relations) {
        genererCodeSourceAnc();
    }


}
