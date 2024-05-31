package com.muse.patterns.factory.pizza.v2;

import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description 纽约口味——素食披萨
 * @author: muse
 **/
public class NYVeggiePizza implements Pizza {

    public void prepare() {
        System.out.println("NYVeggiePizza prepare()");
    }

    public void bake() {
        System.out.println("NYVeggiePizza bake()");
    }

    public void cut() {
        System.out.println("NYVeggiePizza cut()");
    }

    public void box() {
        System.out.println("NYVeggiePizza box()");
    }
}
