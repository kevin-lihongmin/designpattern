package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   芝加哥蔬菜披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:02
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        System.out.println("初始化：我是芝加哥蔬菜披萨！");
    }

    @Override
    public void say() {
        System.out.println("我是芝加哥蔬菜披萨！");
    }
}
