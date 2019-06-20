package com.kevin.designpattern.headfirst.factory.abstractfactory.pizza;

import com.kevin.designpattern.headfirst.factory.simple.product.CheesePizza;
import com.kevin.designpattern.headfirst.factory.simple.product.ClamPizza;
import com.kevin.designpattern.headfirst.factory.simple.product.PepperoniPizza;
import com.kevin.designpattern.headfirst.factory.simple.product.VeggiePizza;

/**
 *   披萨类型
 *
 * @author lihongmin
 * @date 2018/9/2 16:16
 */
public enum PizzaEnum {

    /**
     * {@link CheesePizza}
     */
    CHEESE_PIZZA,

    /**
     * {@link ClamPizza}
     */
    CLAM_PIZZA,

    /**
     * {@link PepperoniPizza}
     */
    PEPPERONI_PIZZA,

    /**
     * {@link VeggiePizza}
     */
    VEGGIE_PIZZA;
}
