package cn.griouges.learn.design.pattern.observer;

/**
 * 观察者接口。
 * 实现这个接口可以成为一个观察者
 * @author Liar
 */
public interface Observer {
    void update(Subject subject);
    
    void update(Subject subject, Object args);
}
