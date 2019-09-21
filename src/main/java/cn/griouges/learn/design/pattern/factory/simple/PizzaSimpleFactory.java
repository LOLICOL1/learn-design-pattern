package cn.griouges.learn.design.pattern.factory.simple;

import cn.griouges.learn.design.pattern.factory.simple.food.DicosPizza;
import cn.griouges.learn.design.pattern.factory.simple.food.KFCPizza;
import cn.griouges.learn.design.pattern.factory.simple.food.MPizza;
import cn.griouges.learn.design.pattern.factory.simple.food.Pizza;

/**
 * @author Liar
 */
public class PizzaSimpleFactory {
    
    public Pizza create(String type) throws Exception {
        Pizza pizza;
        switch (type) {
            case "KFC":
                pizza = new KFCPizza();
                break;
            case "Dicos":
                pizza = new DicosPizza();
                break;
            case "McDonald":
                pizza = new MPizza();
                break;
            default:
                throw new Exception("type error");
        }
        return pizza;
    }
}