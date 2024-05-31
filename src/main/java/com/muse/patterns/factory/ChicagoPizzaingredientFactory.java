package com.muse.patterns.factory;

import com.muse.patterns.factory.ingredient.Cheese;
import com.muse.patterns.factory.ingredient.Clams;
import com.muse.patterns.factory.ingredient.Dough;
import com.muse.patterns.factory.ingredient.FreshClams;
import com.muse.patterns.factory.ingredient.MarinaraSauce;
import com.muse.patterns.factory.ingredient.ReggianoCheese;
import com.muse.patterns.factory.ingredient.Sauce;
import com.muse.patterns.factory.ingredient.ThinCrustDough;

/**
 * @description 芝加哥原料工厂
 * @author: muse
 **/
public class ChicagoPizzaingredientFactory implements PizzaIngredientFactory {

    // 薄的面包皮生面团
    public Dough createDough() {
        return new ThinCrustDough();
    }

    // 番茄酱酱汁
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    // 帕尔玛奶酪
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    // 新鲜蛤蜊
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public String toString() {
        return "ChicagoPizzaingredientFactory";
    }
}
