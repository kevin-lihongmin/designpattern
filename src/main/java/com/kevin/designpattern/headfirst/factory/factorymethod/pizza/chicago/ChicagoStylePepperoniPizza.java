package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.chicago;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   芝加哥的意大利香肠披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:02
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        System.out.println("初始化：我是芝加哥意大利香肠披萨！");
    }

    @Override
    public void say() {
        System.out.println("我是芝加哥意大利香肠披萨！");
    }
}
