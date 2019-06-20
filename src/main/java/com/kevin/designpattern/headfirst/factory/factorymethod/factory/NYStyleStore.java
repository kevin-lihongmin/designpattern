package com.kevin.designpattern.headfirst.factory.factorymethod.factory;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.ny.NYStyleCheesePizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.ny.NYStyleClamPizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.ny.NYStylePepperoniPizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.ny.NYStyleVeggiePizza;

/**
 *   纽约披萨店
 *
 * @author lihongmin
 * @date 2018/9/2 16:58
 */
public class NYStyleStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza = null;
        if (pizzaEnum == PizzaEnum.CHEESE_PIZZA) {
            pizza = new NYStyleCheesePizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.CLAM_PIZZA) {
            pizza = new NYStyleClamPizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.PEPPERONI_PIZZA) {
            pizza = new NYStylePepperoniPizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.VEGGIE_PIZZA) {
            pizza = new NYStyleVeggiePizza();
            return pizza;
        }
        return null;
    }
}
