package cn.griouges.learn.design.pattern.factory.simple.store;

import cn.griouges.learn.design.pattern.factory.simple.PizzaSimpleFactory;
import cn.griouges.learn.design.pattern.factory.simple.food.Pizza;

/**
 * @author Liar
 */
public class PizzaStore {
    public Pizza orderPizza(String type) throws Exception {
        return new PizzaSimpleFactory().create(type);
    }
}