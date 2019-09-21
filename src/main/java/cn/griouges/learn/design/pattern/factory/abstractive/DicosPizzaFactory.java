package cn.griouges.learn.design.pattern.factory.abstractive;

import cn.griouges.learn.design.pattern.factory.abstractive.food.DicosCheesePizza;
import cn.griouges.learn.design.pattern.factory.abstractive.food.DicosCreamPizza;
import cn.griouges.learn.design.pattern.factory.abstractive.food.Pizza;

/**
 * 制作德克士的披萨的工厂
 *
 * @author Liar
 */
public class DicosPizzaFactory extends AbstractPizzaFactory {
    @Override
    public Pizza create(String type) {
        Pizza pizza;
        switch (type) {
            case "Cheese":
                pizza = new DicosCheesePizza();
                break;
            case "Cream":
                pizza = new DicosCreamPizza();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}