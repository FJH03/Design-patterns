package com.muse.patterns.factory.store.v2;

import com.muse.patterns.factory.pizza.Pizza;
import com.muse.patterns.factory.pizza.v2.NYCheesePizza;
import com.muse.patterns.factory.pizza.v2.NYClamPizza;
import com.muse.patterns.factory.pizza.v2.NYPepperoniPizza;
import com.muse.patterns.factory.pizza.v2.NYVeggiePizza;

/**
 * @description
 * @author: muse
 **/
public class NYPizzaStore extends PizzaStoreV2 {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
