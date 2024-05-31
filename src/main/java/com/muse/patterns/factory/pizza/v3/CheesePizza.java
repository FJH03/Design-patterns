package com.muse.patterns.factory.pizza.v3;

import com.muse.patterns.factory.PizzaIngredientFactory;

/**
 * @description 奶酪口味披萨
 * @author: muse
 **/
public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "CheesePizza";
    }

    /** 奶酪披萨需要原料：面团、酱、干酪 */
    public void prepare() {
        System.out.println("CheesePizza prepare() include: dough、sauce、cheese");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
