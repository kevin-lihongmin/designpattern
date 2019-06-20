package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.ny;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   纽约芝士披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:02
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        System.out.println("初始化：我是纽约芝士披萨！");
    }

    @Override
    public void say() {
        System.out.println("我是纽约芝士披萨！");
    }
}
