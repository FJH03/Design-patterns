package com.muse.patterns.factory;

import com.muse.patterns.factory.ingredient.Cheese;
import com.muse.patterns.factory.ingredient.Clams;
import com.muse.patterns.factory.ingredient.Dough;
import com.muse.patterns.factory.ingredient.Sauce;

/**
 * @description 披萨原料工厂
 * @author: muse
 **/
public interface PizzaIngredientFactory {

    // 获得生面团原料
    Dough createDough();

    // 获得酱汁原料
    Sauce createSauce();

    // 获得奶酪原料
    Cheese createCheese();

    // 获得蛤蜊原料
    Clams createClams();
}
