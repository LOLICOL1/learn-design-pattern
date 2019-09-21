package cn.griouges.learn.design.pattern.factory.abstractive;

import cn.griouges.learn.design.pattern.factory.abstractive.food.KFCClamPizza;
import cn.griouges.learn.design.pattern.factory.abstractive.food.KFCVeggiePizza;
import cn.griouges.learn.design.pattern.factory.abstractive.food.Pizza;

/**
 * 制作KFC的披萨的工厂
 *
 * @author Liar
 */
public class KFCPizzaFactory extends AbstractPizzaFactory {
    
    @Override
    public Pizza create(String type) {
        Pizza pizza;
        switch (type) {
            case "Clam":
                pizza = new KFCClamPizza();
                break;
            case "Veggie":
                pizza = new KFCVeggiePizza();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}