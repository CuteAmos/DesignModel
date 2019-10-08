package observer.simpleObserver.subject;



import observer.simpleObserver.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer){
        observers.add(observer);
    }
    public void detach(IObserver observer){
        observers.remove(observer);
    }
    public void toNotify(){
        for (IObserver observer : observers) {
            observer.update();
        }
    }
    public abstract String getState();
}
