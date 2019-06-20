package com.kevin.designpattern.headfirst.factory.simple.product;

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
    void say() {
        System.out.println("我是Pepperoni披萨，创建好了！");
    }
}
