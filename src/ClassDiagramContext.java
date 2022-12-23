import entitiesOfClassDiagram.Entity;
import relationOfClassDiagram.Relation;
import strategyPattern.GenererStrategyImpl;
import strategyPattern.IExporterStrategy;
import strategyPattern.IExporterStrategyJSON;
import strategyPattern.IGenererStrategy;

import java.util.ArrayList;
import java.util.List;

public class ClassDiagramContext {

    private List<Entity> entities = new ArrayList<>();
    private List<Relation> relations = new ArrayList<>();


    private IGenererStrategy genererStrategy = new GenererStrategyImpl() ;
    private IExporterStrategy exporterStrategy = new IExporterStrategyJSON() ; // default strategy

    public void appliquerStrategyGenerer(  ){
        System.out.println("Initialisation"); // partie constante
        System.out.println(".........."); // partie constante
        genererStrategy.genererCodeSource(entities , relations);              // partie dynamique
        System.out.println(".........."); // code qui demeur constante

    }

    public void appliquerStrategyExporter(  ){
        System.out.println("Initialisation"); // partie constante
        System.out.println(".........."); // partie constante
        exporterStrategy.exporterDiagram();              // partie dynamique
        System.out.println(".........."); // code qui demeur constante

    }

    public void setStrategyGenerer(IGenererStrategy strategy) {
        this.genererStrategy = strategy;
    }

    public void setStrategyExporter(IExporterStrategy strategy) {
        this.exporterStrategy = strategy;
    }



}
