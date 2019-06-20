package com.kevin.designpattern.headfirst.factory.simple.product;

/**
 *   Veggie披萨
 *
 * @author lihongmin
 * @date 2018/9/2 16:10
 */
public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        System.out.println("我是Veggie披萨，创建好了！");
    }

    @Override
    void say() {
        System.out.println("我是Veggie披萨，创建好了！");
    }
}
