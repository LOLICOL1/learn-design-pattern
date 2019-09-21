package cn.griouges.learn.design.pattern.singleton.eager;

/**
 * @author Liar
 */
public class Singleton {
    
    private static Singleton instance = new Singleton();
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return instance;
    }
    
    //other methods
}