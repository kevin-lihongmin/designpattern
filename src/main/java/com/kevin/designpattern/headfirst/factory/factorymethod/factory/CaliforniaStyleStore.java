package com.kevin.designpattern.headfirst.factory.factorymethod.factory;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.california.CaliforniaStyleCheesePizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.california.CaliforniaStyleClamPizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.california.CaliforniaStylePepperoniPizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.california.CaliforniaStyleVeggiePizza;

/**
 *   加州披萨店
 *
 * @author lihongmin
 * @date 2018/9/2 16:58
 */
public class CaliforniaStyleStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza = null;
        if (pizzaEnum == PizzaEnum.CHEESE_PIZZA) {
            pizza = new CaliforniaStyleCheesePizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.CLAM_PIZZA) {
            pizza = new CaliforniaStyleClamPizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.PEPPERONI_PIZZA) {
            pizza = new CaliforniaStylePepperoniPizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.VEGGIE_PIZZA) {
            pizza = new CaliforniaStyleVeggiePizza();
            return pizza;
        }
        return null;
    }
}
