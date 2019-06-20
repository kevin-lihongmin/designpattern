package com.kevin.designpattern.headfirst.factory.factorymethod.pizza;


/**
 *   Pepperoni披萨
 *
 * @author lihongmin
 * @date 2018/9/2 16:10
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        System.out.println("我是Pepperoni披萨，创建好了！");
    }

    @Override
    public void say() {
        System.out.println("我是Pepperoni披萨，创建好了！");
    }
}
