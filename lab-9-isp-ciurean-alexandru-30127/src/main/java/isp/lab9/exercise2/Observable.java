package isp.lab9.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    public void changeState(Object event, double value) {
        notifyAllObservers(event, value);
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers(Object event, double value) {
        for (Observer observer : observers) {
            observer.update(event, value);
        }
    }
}
