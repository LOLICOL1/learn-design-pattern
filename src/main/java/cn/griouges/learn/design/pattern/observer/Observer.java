package cn.griouges.learn.design.pattern.observer;

/**
 * @author Liar
 */
public interface Observer {
    void update(Subject subject);
    
    void update(Subject subject, Object args);
}
