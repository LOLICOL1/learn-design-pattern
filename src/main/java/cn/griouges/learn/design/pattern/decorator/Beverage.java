package cn.griouges.learn.design.pattern.decorator;

/**
 * @author Liar
 */
public abstract class Beverage {
    String description = "unknown beverage";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}