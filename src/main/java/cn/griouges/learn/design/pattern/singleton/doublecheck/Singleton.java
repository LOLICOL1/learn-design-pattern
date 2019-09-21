package cn.griouges.learn.design.pattern.singleton.doublecheck;

/**
 * @author Liar
 */
public class Singleton {
    
    
    private volatile static Singleton instance;
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
    //other methods
}