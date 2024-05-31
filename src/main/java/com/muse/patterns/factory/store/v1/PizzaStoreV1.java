package com.muse.patterns.factory.store.v1;

import com.muse.patterns.factory.SimplePizzaFactory;
import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description
 * @author: muse
 **/
public class PizzaStoreV1 {

    private SimplePizzaFactory factory;

    public PizzaStoreV1(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = factory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
