package cn.griouges.learn.design.pattern.factory.method.store;

import cn.griouges.learn.design.pattern.factory.method.food.DicosCheesePizza;
import cn.griouges.learn.design.pattern.factory.method.food.DicosCreamPizza;
import cn.griouges.learn.design.pattern.factory.method.food.Pizza;

/**
 * @author Liar
 */
public class DicosPizzaStore extends AbstractPizzaStore {
    /**
     * 根据type制作不同口味的德克士披萨
     *
     * @param type 披萨的口味
     * @return 披萨
     * @throws Exception 当找不到type口味的披萨是抛出
     */
    @Override
    public Pizza create(String type) throws Exception {
        Pizza pizza;
        switch (type) {
            case "Cheese":
                pizza = new DicosCheesePizza();
                break;
            case "Cream":
                pizza = new DicosCreamPizza();
                break;
            default:
                throw new Exception("type error");
        }
        return pizza;
    }
}