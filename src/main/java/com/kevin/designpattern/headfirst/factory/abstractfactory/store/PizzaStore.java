package com.kevin.designpattern.headfirst.factory.abstractfactory.store;


import com.kevin.designpattern.headfirst.factory.abstractfactory.pizza.Pizza;
import com.kevin.designpattern.headfirst.factory.abstractfactory.pizza.PizzaEnum;

/**
 *   披萨店
 *
 * @author lihongmin
 * @date 2018/9/2 16:53
 */
public abstract class PizzaStore<T extends PizzaEnum> {

    public Pizza orderPizza(T t) {
        Pizza pizza = createPizza(t);

        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("客人的披萨做好了，上菜， 流口水了！！！");

        return pizza;
    }

    /**
     *  让具体的各地商店实现
     * @param t
     * @return
     */
    public abstract Pizza createPizza(T t);
}
