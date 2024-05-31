package com.muse.patterns.factory.pizza.v1;

import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description 意大利辣肉肠披萨
 * @author: muse
 **/
public class PepperoniPizza implements Pizza {

    public void prepare() {
        System.out.println("PepperoniPizza prepare()");
    }

    public void bake() {
        System.out.println("PepperoniPizza bake()");
    }

    public void cut() {
        System.out.println("PepperoniPizza cut()");
    }

    public void box() {
        System.out.println("PepperoniPizza box()");
    }
}
