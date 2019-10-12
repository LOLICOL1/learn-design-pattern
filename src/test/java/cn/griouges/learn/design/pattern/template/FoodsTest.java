package cn.griouges.learn.design.pattern.template;

import org.junit.Test;

import java.util.Arrays;

public class FoodsTest {
    
    @Test
    public void test() {
        Foods[] foods = {
                new Foods("c", 3),
                new Foods("a", 1),
                new Foods("b", 2),
                new Foods("d", 0)
        };
        Arrays.sort(foods);
        System.out.println(Arrays.toString(foods));
    }
}