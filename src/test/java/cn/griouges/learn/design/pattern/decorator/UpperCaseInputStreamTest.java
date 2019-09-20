package cn.griouges.learn.design.pattern.decorator;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class UpperCaseInputStreamTest {
    
    InputStream inputStream;
    
    @Before
    public void init() {
        inputStream = new UpperCaseInputStream(new BufferedInputStream(Objects.requireNonNull(UpperCaseInputStreamTest.class.getClassLoader().getResourceAsStream("a.txt"))));
    }
    
    
    @Test
    public void read() throws IOException {
        int c;
        while ((c = inputStream.read()) >= 0) {
            System.out.print((char) c);
        }
    }
    
    @Test
    public void testRead() {
    }
}