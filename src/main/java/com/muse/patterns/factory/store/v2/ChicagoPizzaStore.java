package com.muse.patterns.factory.store.v2;

import com.muse.patterns.factory.pizza.Pizza;
import com.muse.patterns.factory.pizza.v2.ChicagoCheesePizza;
import com.muse.patterns.factory.pizza.v2.ChicagoClamPizza;
import com.muse.patterns.factory.pizza.v2.ChicagoPepperoniPizza;
import com.muse.patterns.factory.pizza.v2.ChicagoVeggiePizza;

/**
 * @description
 * @author: muse
 **/
public class ChicagoPizzaStore extends PizzaStoreV2 {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ChicagoClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}
