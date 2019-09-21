package cn.griouges.learn.design.pattern.factory.abstractive;

import cn.griouges.learn.design.pattern.factory.abstractive.food.Pizza;

/**
 * @author Liar
 */
public abstract class AbstractPizzaFactory {
    public abstract Pizza create(String type);
}
