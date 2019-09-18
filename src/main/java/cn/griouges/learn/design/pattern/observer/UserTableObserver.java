package cn.griouges.learn.design.pattern.observer;

/**
 * @author Liar
 */
public class UserTableObserver implements Observer {
    
    private Subject subject;
    
    public UserTableObserver(Subject subject) {
        this.subject=subject;
    }
    
    @Override
    public void update(Subject subject) {
        update(subject, null);
    }
    
    @Override
    public void update(Subject subject, Object args) {
        System.out.println(args == null ? "" : args + " 同步成功!");
    }
    
    public void register(){
        subject.registerObserver(this);
    }
}