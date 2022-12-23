package observerPattern;

import observerPattern.IObservable;

public interface Observer {

    public void update(IObservable observable);
}
