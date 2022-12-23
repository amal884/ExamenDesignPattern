package observerPattern;

import observerPattern.IObservable;
import observerPattern.Observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(IObservable observable) {

        System.out.println("Observer1 updated ");

    }
}
