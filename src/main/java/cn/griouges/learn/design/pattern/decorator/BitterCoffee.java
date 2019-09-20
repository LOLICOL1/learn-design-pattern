package cn.griouges.learn.design.pattern.decorator;

/**
 * @author Liar
 */
public class BitterCoffee extends Beverage {
    public BitterCoffee() {
        description = "苦咖啡";
    }
    
    @Override
    public double cost() {
        return 36.8;
    }
}