import entitiesOfClassDiagram.Entity;
import relationOfClassDiagram.Relation;

import java.util.List;

public interface IGenererStrategy {

    public void genererCodeSource(List<Entity> entities, List<Relation> relations);
}
