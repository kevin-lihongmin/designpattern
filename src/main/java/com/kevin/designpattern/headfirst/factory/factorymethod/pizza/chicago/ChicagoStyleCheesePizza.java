package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   芝加哥芝士披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:08
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {

        System.out.println("初始化：我的芝加哥芝士披萨！");
    }

    @Override
    public void say() {
        System.out.println("我的芝加哥芝士披萨！");
    }
}
