package cn.griouges.learn.design.pattern.strategy;

/**
 * @author Liar
 */
public class QuackVoice implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}