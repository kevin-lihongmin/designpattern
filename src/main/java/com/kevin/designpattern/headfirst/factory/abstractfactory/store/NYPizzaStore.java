package com.kevin.designpattern.headfirst.factory.abstractfactory.store;

import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.NYPizzaIngredientFactory;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.PizzaIngredientFactory;
import com.kevin.designpattern.headfirst.factory.abstractfactory.pizza.*;

/**
 *   纽约披萨店
 * @author lihongmin
 * @date 2018/9/2 22:04
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaEnum pizzaEnum) {
        Pizza pizza = null;

        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if (pizzaEnum == PizzaEnum.CHEESE_PIZZA) {
            pizza = new CheesePizza(factory);
            pizza.setPizzaName("纽约芝士披萨");
        }
        if (pizzaEnum == PizzaEnum.VEGGIE_PIZZA) {
            pizza = new VeggiePizza(factory);
            pizza.setPizzaName("纽约素食披萨");
        }
        if (pizzaEnum == PizzaEnum.PEPPERONI_PIZZA) {
            pizza = new PepperoniPizza(factory);
            pizza.setPizzaName("纽约意大利香肠披萨");
        }
        if (pizzaEnum == PizzaEnum.CHEESE_PIZZA) {
            pizza = new CheesePizza(factory);
            pizza.setPizzaName("纽约海鲜披萨");
        }
        return pizza;
    }
}
