package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.ny;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   纽约的意大利香肠披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:02
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        System.out.println("初始化：我是纽约意大利香肠披萨！");
    }

    @Override
    public void say() {
        System.out.println("我是纽约意大利香肠披萨！");
    }
}
