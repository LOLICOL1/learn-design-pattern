package cn.griouges.learn.design.pattern.singleton.inner;

/**
 * @author Liar
 */
public class Singleton {
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return Inner.instance;
    }
    
    static class Inner {
        static Singleton instance = new Singleton();
    }
    
    //other methods
}