package com.muse.patterns.factory.store.v3;

import com.muse.patterns.factory.NYPizzaingredientFactory;
import com.muse.patterns.factory.PizzaIngredientFactory;
import com.muse.patterns.factory.pizza.v3.Pizza;
import com.muse.patterns.factory.pizza.v3.VeggiePizza;
import com.muse.patterns.factory.pizza.v3.CheesePizza;
import com.muse.patterns.factory.pizza.v3.ClamPizza;
import com.muse.patterns.factory.pizza.v3.PepperoniPizza;

/**
 * @description
 * @author: muse
 **/
public class NYPizzaStore extends PizzaStoreV3 {

    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaingredientFactory(); // 纽约口味配料工厂
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
