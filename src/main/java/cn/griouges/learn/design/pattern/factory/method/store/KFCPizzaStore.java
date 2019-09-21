package cn.griouges.learn.design.pattern.factory.method.store;

import cn.griouges.learn.design.pattern.factory.method.food.KFCPizza;
import cn.griouges.learn.design.pattern.factory.method.food.Pizza;

/**
 * 纽约披萨店
 *
 * @author Liar
 */
public class KFCPizzaStore extends AbstractPizzaStore {
    /**
     * 只有一种经典口味的披萨
     *
     * @param type 披萨的口味
     * @return 披萨
     */
    @Override
    public Pizza create(String type) {
        return new KFCPizza();
    }
}