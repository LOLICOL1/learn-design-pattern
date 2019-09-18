package cn.griouges.learn.design.pattern.observer;

/**
 * @author Liar
 */
public interface Subject {
    void registerObserver(Observer observer);
    
    void removeObserver(Observer observer);
    
    void notifyObserver();
    
    void notifyObserver(Object args);
}