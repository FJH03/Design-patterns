package com.muse.patterns.factory.pizza.v2;

import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description 纽约口味——意大利辣香肠披萨
 * @author: muse
 **/
public class NYPepperoniPizza implements Pizza {

    public void prepare() {
        System.out.println("NYPepperoniPizza prepare()");
    }

    public void bake() {
        System.out.println("NYPepperoniPizza bake()");
    }

    public void cut() {
        System.out.println("NYPepperoniPizza cut()");
    }

    public void box() {
        System.out.println("NYPepperoniPizza box()");
    }
}
