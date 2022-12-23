package strategyPattern;

import entitiesOfClassDiagram.Entity;
import relationOfClassDiagram.Relation;
import strategyPattern.IGenererStrategy;

import java.util.List;

public class GenererStrategyImpl implements IGenererStrategy {
    @Override
    public void genererCodeSource(List<Entity> entities, List<Relation> relations) {
        System.out.println(" the source Code Has generated successfully....");
    }
}
