package cn.griouges.learn.design.adapter;

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