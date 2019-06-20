package com.kevin.designpattern.headfirst.factory.factorymethod.factory;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago.ChicagoStyleCheesePizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago.ChicagoStyleClamPizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago.ChicagoStylePepperoniPizza;
import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago.ChicagoStyleVeggiePizza;

/**
 *   芝加哥披萨店
 *
 * @author lihongmin
 * @date 2018/9/2 16:58
 */
public class ChicagoStyleStore extends PizzaStore{
    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza = null;
        if (pizzaEnum == PizzaEnum.CHEESE_PIZZA) {
            pizza = new ChicagoStyleCheesePizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.CLAM_PIZZA) {
            pizza = new ChicagoStyleClamPizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.PEPPERONI_PIZZA) {
            pizza = new ChicagoStylePepperoniPizza();
            return pizza;
        }
        if (pizzaEnum == PizzaEnum.VEGGIE_PIZZA) {
            pizza = new ChicagoStyleVeggiePizza();
            return pizza;
        }
        return null;
    }
}
