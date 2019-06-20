package com.kevin.designpattern.headfirst.factory.simple.product;

/**
 *   芝士披萨
 *
 * @author lihongmin
 * @date 2018/9/2 16:10
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        System.out.println("我是芝士披萨，创建好了！");
    }

    @Override
    void say() {
        System.out.println("我是芝士披萨，创建好了！");
    }
}
