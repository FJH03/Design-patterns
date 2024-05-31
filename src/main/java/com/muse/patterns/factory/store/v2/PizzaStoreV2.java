package com.muse.patterns.factory.store.v2;

import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description
 * @author: muse
 **/
public abstract class PizzaStoreV2 {

    protected abstract Pizza createPizza(String pizzaType);

    public Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
