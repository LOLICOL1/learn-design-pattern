package cn.griouges.learn.design.pattern.adapter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class IteratorAdapterTest {
    
    @Test
    public void test() {
        List<String> nameList = new ArrayList<>();
        nameList.add("li si");
        nameList.add("zhang san");
        nameList.add("wang wu");
        
        Enumeration enumeration = new IteratorAdapter(nameList.iterator());
        
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        
    }
    
}