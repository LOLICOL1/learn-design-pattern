package cn.griouges.learn.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liar
 */
public class DatatableSubject implements Subject {
    
    private List<Observer> observers = new ArrayList<>();
    
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    
    @Override
    public void notifyObserver(Object args) {
        for (Observer observer : observers) {
            observer.update(this, args);
        }
    }
}