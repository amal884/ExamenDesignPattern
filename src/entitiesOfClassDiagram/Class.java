package entitiesOfClassDiagram;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

public class Class extends Entity  implements IObservable {

    private List<Observer> observers = new ArrayList<>();

    private classStatus classStatus ;
    private List<Attribut> attributs = new ArrayList<>();
    private List<Method> methods = new ArrayList<>();
    private List<Constructor> constructors = new ArrayList<>();

    public Class(String name) {
        super(name);
    }

    @Override
    public void show() {

        System.out.println(tab()+"class :  " + name);

    }


    @Override
    public void subscribe(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {

        observers.remove(observer);



    }

    @Override
    public void notifyObserver() {
        for (Observer o :observers) {
            o.update(this);

        }
    }

    public void setAttributs(String etat) {

        this.notifyObserver();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public entitiesOfClassDiagram.classStatus getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(entitiesOfClassDiagram.classStatus classStatus) {
        this.classStatus = classStatus;
    }

    public List<Attribut> getAttributs() {
        return attributs;
    }

    public void setAttributs(List<Attribut> attributs) {
        this.attributs = attributs;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<Constructor> constructors) {
        this.constructors = constructors;
    }
}
