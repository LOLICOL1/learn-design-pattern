package cn.griouges.learn.design.pattern.decorator;

/**
 * @author Liar
 */
public class ClassicMilkTea extends Beverage {
    
    public ClassicMilkTea() {
        description = "经典奶茶";
    }
    
    @Override
    public double cost() {
        return 26.5;
    }
}