package cn.griouges.learn.design.pattern.singleton.lazy;

/**
 * @author Liar
 */
public class Singleton {
    
    private static Singleton instance;
    
    private Singleton() {
    }
    
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    //other methods
}
