package com.muse.patterns.factory;

import com.muse.patterns.factory.ingredient.Cheese;
import com.muse.patterns.factory.ingredient.Clams;
import com.muse.patterns.factory.ingredient.Dough;
import com.muse.patterns.factory.ingredient.FrozenClams;
import com.muse.patterns.factory.ingredient.MozzarellaCheese;
import com.muse.patterns.factory.ingredient.PlumTomatoSauce;
import com.muse.patterns.factory.ingredient.Sauce;
import com.muse.patterns.factory.ingredient.ThickCrustDough;

/**
 * @description 纽约原料工厂
 * @author: muse
 **/
public class NYPizzaingredientFactory implements PizzaIngredientFactory {

    // 厚的面包皮生面团
    public Dough createDough() {
        return new ThickCrustDough();
    }

    // 梅子西红柿酱汁
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    // 莫泽雷勒干酪
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    // 冷冻蛤蜊
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public String toString() {
        return "NYPizzaingredientFactory";
    }
}
