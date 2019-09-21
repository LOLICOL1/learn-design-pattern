package cn.griouges.learn.design.pattern.singleton.eager;

import cn.griouges.learn.design.pattern.singleton.doublecheck.Singleton;
import org.junit.Test;

public class SingletonTest {
    
    @Test
    public void getInstance() throws InterruptedException {
        new Thread(() -> {
            cn.griouges.learn.design.pattern.singleton.doublecheck.Singleton singleton;
            for (int i = 0; i < 10; i++) {
                singleton = cn.griouges.learn.design.pattern.singleton.doublecheck.Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ": " + singleton);
            }
        }).start();
        new Thread(() -> {
            cn.griouges.learn.design.pattern.singleton.doublecheck.Singleton singleton;
            for (int i = 0; i < 10; i++) {
                singleton = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ": " + singleton);
            }
        }).start();
        Thread.sleep(2000); //等待子线程执行完
    }
}