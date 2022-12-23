package observerPattern;

import observerPattern.IObservable;
import observerPattern.Observer;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(IObservable observable) {
        System.out.println("Observer2 updated ");

    }
}
