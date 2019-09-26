package cn.griouges.learn.design.pattern.adapter;

/**
 * @author Liar
 */
public class Turkey implements Chicken {
    @Override
    public void gobble() {
        System.out.println("Gobble.");
    }
    
    @Override
    public void fly() {
        System.out.println("Flying a short distance.");
    }
}