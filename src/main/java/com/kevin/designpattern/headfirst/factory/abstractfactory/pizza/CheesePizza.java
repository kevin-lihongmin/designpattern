package com.kevin.designpattern.headfirst.factory.abstractfactory.pizza;


import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.PizzaIngredientFactory;
import com.kevin.designpattern.headfirst.factory.abstractfactory.factory.PizzaIngredientFactory;

/**
 *   芝士披萨
 *
 * @author lihongmin
 * @date 2018/9/2 16:10
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        System.out.println("我是芝士披萨，利用工厂传入的方式创建好了！");
        this.factory = factory;
    }

    public CheesePizza() {

        System.out.println("我是芝士披萨，创建好了！");
    }

    @Override
    void prepare() {
        System.out.println("我装备好了，我是：" + pizzaName);
        System.out.println("并且我利用工厂传入的调料赋值了每种调料（我是动态的哦）！");
        dough = factory.createFough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }

    @Override
    public void say() {
        System.out.println("我是芝士披萨，创建好了！");
    }
}
