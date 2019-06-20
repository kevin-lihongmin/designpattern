package com.kevin.designpattern.headfirst.factory.simple.product;

/**
 *   Clam披萨
 *
 * @author lihongmin
 * @date 2018/9/2 16:10
 */
public class ClamPizza extends Pizza {

    public ClamPizza() {
        System.out.println("我是Clam披萨，创建好了！");
    }

    @Override
    void say() {
        System.out.println("我是Clam披萨，创建好了！");
    }
}
