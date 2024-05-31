package com.muse.patterns.factory.pizza.v2;

import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description 纽约口味——奶酪披萨
 * @author: muse
 **/
public class NYCheesePizza implements Pizza {

    public void prepare() {
        System.out.println("NYCheesePizza prepare()");
    }

    public void bake() {
        System.out.println("NYCheesePizza bake()");
    }

    public void cut() {
        System.out.println("NYCheesePizza cut()");
    }

    public void box() {
        System.out.println("NYCheesePizza box()");
    }
}
