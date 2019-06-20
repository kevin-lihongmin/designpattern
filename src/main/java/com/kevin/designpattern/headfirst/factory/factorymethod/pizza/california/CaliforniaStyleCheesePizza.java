package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.california;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   加州芝士披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:02
 */
public class CaliforniaStyleCheesePizza extends Pizza {

    public CaliforniaStyleCheesePizza() {
        System.out.println("初始化：我是加州芝士披萨！");
    }

    @Override
    public void say() {
        System.out.println("我是加州芝士披萨！");
    }
}
