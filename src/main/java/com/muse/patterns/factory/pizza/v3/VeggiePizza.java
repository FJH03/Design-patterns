package com.muse.patterns.factory.pizza.v3;

import com.muse.patterns.factory.PizzaIngredientFactory;

/**
 * @description 蔬菜口味披萨
 * @author: muse
 **/
public class VeggiePizza extends Pizza {

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        this.name = "VeggiePizza";
    }

    /** 蔬菜口味披萨需要原料：面团、干酪*/
    public void prepare() {
        System.out.println("VeggiePizza prepare() include: dough、cheese");
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
