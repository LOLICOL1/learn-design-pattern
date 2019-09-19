package cn.griouges.learn.design.pattern.strategy;

/**
 * @author Liar
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flying with wings!");
        
    }
}