package cn.griouges.learn.design.adapter;

import org.junit.Test;

public class ChickenAdapterTest {
    
    @Test
    public void test() {
        Duck duck = new ChickenAdapter(new Turkey());
        duck.quack();
        duck.fly();
    }
    
}