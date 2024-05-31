package com.muse.patterns.factory.pizza.v1;

import com.muse.patterns.factory.pizza.Pizza;

/**
 * @description 蛤蜊披萨
 * @author: muse
 **/
public class ClamPizza implements Pizza {

    public void prepare() {
        System.out.println("ClamPizza prepare()");
    }

    public void bake() {
        System.out.println("ClamPizza bake()");
    }

    public void cut() {
        System.out.println("ClamPizza cut()");
    }

    public void box() {
        System.out.println("ClamPizza box()");
    }
}
