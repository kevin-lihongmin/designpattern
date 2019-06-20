package com.kevin.designpattern.headfirst.factory.factorymethod.pizza.california;

import com.kevin.designpattern.headfirst.factory.factorymethod.pizza.Pizza;

/**
 *   加州的意大利香肠披萨
 *
 * @author lihongmin
 * @date 2018/9/2 17:02
 */
public class CaliforniaStylePepperoniPizza extends Pizza {

    public CaliforniaStylePepperoniPizza() {
        System.out.println("初始化：我是加州意大利香肠披萨！");
    }

    @Override
    public void say() {
        System.out.println("我是加州意大利香肠披萨！");
    }
}
