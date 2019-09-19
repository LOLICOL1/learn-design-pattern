package cn.griouges.learn.design.pattern.strategy;

/**
 * @author Liar
 */
public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        //不能叫
    }
}