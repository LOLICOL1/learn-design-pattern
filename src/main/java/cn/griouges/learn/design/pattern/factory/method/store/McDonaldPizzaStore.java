package cn.griouges.learn.design.pattern.factory.method.store;

import cn.griouges.learn.design.pattern.factory.method.food.MPizza;
import cn.griouges.learn.design.pattern.factory.method.food.Pizza;

/**
 * @author Liar
 */
public class McDonaldPizzaStore extends AbstractPizzaStore {
    /**
     * 只有一种经典口味的披萨
     *
     * @param type 披萨的口味
     * @return 披萨
     */
    @Override
    public Pizza create(String type) {
        return new MPizza();
    }
}