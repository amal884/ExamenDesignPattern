import adapterPattern.AdapterImplGenerator;
import entitiesOfClassDiagram.Class;
import compositePattern.Group;
import observerPattern.Observer;
import observerPattern.ObserverImpl1;
import observerPattern.ObserverImpl2;
import strategyPattern.IExporterStrategySVG;

public class ApplicationTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        ClassDiagramContext context = new ClassDiagramContext();

        System.out.println("tester Exporter Strategy*************************");

        context.appliquerStrategyExporter();
        context.setStrategyExporter(new IExporterStrategySVG());
        context.appliquerStrategyExporter();

        System.out.println("tester Generer Strategy*************************");
        context.appliquerStrategyGenerer();

        System.out.println("tester Generer Adapter*************************");
        context.setStrategyGenerer(new AdapterImplGenerator());
        context.appliquerStrategyGenerer();

        System.out.println("tester Composite Pattern*************************");

        Group root = new Group("Design pattern");
        Group d1 =(Group) root.addComposant(new Group("classGroup1")) ;
        Group d2 =(Group)root.addComposant(new Group("classGroup2")) ;
        Group d3 =(Group)root.addComposant(new Group("classGroup3")) ;
        d1.addComposant(new Class("class1"));
        d1.addComposant(new Class("class2"));
        d2.addComposant(new Class("class3"));
        d2.addComposant(new Class("class4"));
        d2.addComposant(new Class("class5"));
        d3.addComposant(new Class("class6"));
        d3.addComposant(new Class("class7"));
        Group d21= (Group)d2.addComposant(new Group("sousClassGroup"));
        d21.addComposant(new Class("C211"));
        d21.addComposant(new Class("C212"));
        d21.addComposant(new Class("C213"));
        root.show();


        System.out.println("tester Observer Pattern*************************");

        Class observable= new Class("Observable");
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setAttributs("newEtat");
        System.out.println("---------------");












    }
}
