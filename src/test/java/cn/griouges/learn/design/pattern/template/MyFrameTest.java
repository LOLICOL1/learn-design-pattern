package cn.griouges.learn.design.pattern.template;

import org.junit.Test;

public class MyFrameTest {
    
    @Test
    public void paint() throws InterruptedException {
        MyFrame frame = new MyFrame("hello");
        Thread.sleep(5000);
    }
}