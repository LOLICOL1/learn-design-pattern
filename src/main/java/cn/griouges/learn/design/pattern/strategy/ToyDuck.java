package cn.griouges.learn.design.pattern.strategy;

/**
 * @author Liar
 */
public class ToyDuck extends Duck {
    public ToyDuck(FlyBehavior flybehavior, QuackBehavior quackBehavior) {
        super(flybehavior, quackBehavior);
    }
    
    /**
     * 默认的玩具鸭不会飞不会叫
     */
    public ToyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new QuackNoWay());
    }
    
    @Override
    public void display() {
        System.out.println("i'm a toy duck");
    }
}