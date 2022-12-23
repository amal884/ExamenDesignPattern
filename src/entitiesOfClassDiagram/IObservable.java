package entitiesOfClassDiagram;



public interface IObservable {

    void subscribe(Observer observer); // add observer
    void unsubscribe(Observer observer);
    void notifyObserver();
}
