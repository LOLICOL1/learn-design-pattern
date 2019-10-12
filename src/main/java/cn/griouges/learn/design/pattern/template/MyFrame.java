package cn.griouges.learn.design.pattern.template;

import javax.swing.*;
import java.awt.*;

/**
 * @author Liar
 */
public class MyFrame extends JFrame {
    
    MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("i rule!", 100, 100);
    }
}