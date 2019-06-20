package com.kevin.designpattern.headfirst.factory.simple.simplefactory;

import com.kevin.designpattern.headfirst.factory.simple.product.*;

/**
 *   简单的{@link Pizza} 生产工厂
 * @author lihongmin
 * @date 2018/9/2 16:20
 */
public class SimplePizzaFactory<T extends PizzaEnum> {

    public Pizza createPizza(T t) {
        System.out.println("简单披萨工厂运转了，开始生产披萨了！");
        Pizza pizza = null;
        if (t == PizzaEnum.CHEESE_PIZZA) {
            pizza = new CheesePizza();
        }
        if (t == PizzaEnum.CLAM_PIZZA) {
            pizza = new ClamPizza();
        }
        if (t == PizzaEnum.PEPPERONI_PIZZA) {
            pizza = new PepperoniPizza();
        }
        if (t == PizzaEnum.VEGGIE_PIZZA) {
            pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("一份披萨制作完成了，完美！");

        return pizza;
    }
}
