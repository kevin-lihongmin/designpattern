package com.kevin.designpattern.headfirst.factory.abstractfactory.factory;

import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.dough.Dough;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.*;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.cheese.Cheese;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.clams.Clams;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.sauce.Sauce;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.stock.veggies.Veggies;

/**
 *   披萨的抽象工厂（顶层）
 *
 * @author lihongmin
 * @date 2018/9/2 21:00
 */
public interface PizzaIngredientFactory {

    /**
     *  创建 生面团 {@link Dough}
     *
     * @return  生面团 {@link Dough}
     */
    Dough createFough();

    /**
     *  创建 {@link Sauce}
     *
     * @return {@link Sauce}
     */
    Sauce createSauce();

    /**
     *  创建 {@link Cheese}
     *
     * @return {@link Cheese}
     */
    Cheese createCheese();

    /**
     *  创建 {@link Veggies}
     *
     * @return {@link Veggies}
     */
    Veggies[] createVeggies();

    /**
     *  创建 {@link Pepperoni}
     *
     * @return {@link Pepperoni}
     */
    Pepperoni createPepperoni();

    /**
     *  创建 {@link Clams}
     *
     * @return {@link Clams}
     */
    Clams createClams();
}
