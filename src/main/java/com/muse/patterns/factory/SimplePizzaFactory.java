package com.muse.patterns.factory;

import com.muse.patterns.factory.pizza.Pizza;
import com.muse.patterns.factory.pizza.v1.CheesePizza;
import com.muse.patterns.factory.pizza.v1.ClamPizza;
import com.muse.patterns.factory.pizza.v1.PepperoniPizza;
import com.muse.patterns.factory.pizza.v1.VeggiePizza;

/**
 * @description 简单工厂
 * @author: muse
 **/
public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
