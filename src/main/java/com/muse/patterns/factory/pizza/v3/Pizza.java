package com.muse.patterns.factory.pizza.v3;

import com.muse.patterns.factory.PizzaIngredientFactory;
import com.muse.patterns.factory.ingredient.Cheese;
import com.muse.patterns.factory.ingredient.Clams;
import com.muse.patterns.factory.ingredient.Dough;
import com.muse.patterns.factory.ingredient.Sauce;

/**
 * @description 披萨抽象类
 * @author: muse
 **/
public abstract class Pizza {
    protected String name;
    protected Dough dough; // 面团
    protected Sauce sauce; // 酱
    protected Cheese cheese; // 干酪
    protected Clams clams; // 蛤蜊
    protected PizzaIngredientFactory pizzaIngredientFactory; // 披萨原料抽象工厂

    /** 准备原材料 */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " and " + pizzaIngredientFactory +" bake()");
    }

    public void cut() {
        System.out.println(name + " and " + pizzaIngredientFactory + " cut()");
    }

    public void box() {
        System.out.println(name + " and " + pizzaIngredientFactory + " box()");
    }
}
